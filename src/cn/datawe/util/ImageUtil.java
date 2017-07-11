package cn.datawe.util;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;

import javax.imageio.ImageIO;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;

import cn.datawe.common.io.ByteArrayInputStream;
import cn.datawe.common.io.ByteArrayOutputStream;

/**
 * 工具类:图片
 * 
 * @author LiuJiaLe
 *
 */
public final class ImageUtil {
	
	/**
	 * 图片类型:JPEG
	 */
	public static final String IMAGE_TYPE_JPEG = "jpeg";
	
	/**
	 * 图片类型:GIF
	 */
	public static final String IMAGE_TYPE_GIF = "gif";
	
	/**
	 * 图片类型:PNG
	 */
	public static final String IMAGE_TYPE_PNG = "png";
	
	/**
	 * 图片类型:BMP
	 */
	public static final String IMAGE_TYPE_BMP = "bmp";
	
	/**
	 * 目前支持的图片类型
	 */
	public static final String[] SUPPORT_IMAGE_TYPE = {IMAGE_TYPE_JPEG, IMAGE_TYPE_GIF, IMAGE_TYPE_PNG, IMAGE_TYPE_BMP};
	
	/**
	 * 翻转方式:水平
	 */
	public static final int FLIP_MODE_HORIZONTAL = 0;
	
	/**
	 * 翻转方式:垂直
	 */
	public static final int FLIP_MODE_VERTICAL = 1;
	
	/**
	 * Base64转图片
	 * 
	 * @param imageBase64
	 * @param destFilePath
	 * @throws Exception
	 */
	public static void toImage(String imageBase64, String destFilePath) throws Exception {
		
		byte[] bytes = Base64.decodeBase64(imageBase64);
		for (int i=0; i<bytes.length; i++) {
			
			if (bytes[i] < 0) {
				
				bytes[i] += 256;
			}
		}
		OutputStream out = new FileOutputStream(destFilePath);
		out.write(bytes);
		out.flush();
		out.close();
	}
	
	
	public static void toImageBatch() throws Exception {
		
		
	}
	
	/**
	 * 缩放图片
	 * 
	 * @param srcFilePath
	 * @param destFilePath
	 * @param ratio
	 * @throws Exception
	 */
	public static void zoom(String srcFilePath, String destFilePath, double ratio) throws Exception {
		
		zoom(srcFilePath, destFilePath, ratio, Image.SCALE_DEFAULT);
	}
	
	/**
	 * 缩放图片
	 * 
	 * @param srcFilePath
	 * @param destFilePath
	 * @param ratio
	 * @param hints
	 * @throws Exception
	 */
	public static void zoom(String srcFilePath, String destFilePath, double ratio, int hints) throws Exception {
		
		File srcFile = getSrcFile(srcFilePath);
		File destFile = getDestFile(destFilePath);
		String imageType = getImageType(srcFile);
		BufferedImage bufferedImage = ImageIO.read(srcFile);
		int width = Integer.parseInt(new DecimalFormat("0").format(bufferedImage.getWidth() * ratio));
		int height = Integer.parseInt(new DecimalFormat("0").format(bufferedImage.getHeight() * ratio));
		/**
		 * Image.SCALE_SMOOTH: 质量优先，速度最慢
		 * Image.SCALE_FAST: 速度优先，速度最快
		 * Image.SCALE_DEFAULT: 默认缩放模式
		 */
		Image image = bufferedImage.getScaledInstance(width, height, hints);
		bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = bufferedImage.createGraphics();
		graphics.drawImage(image, 0, 0, null);
		graphics.dispose();
		ImageIO.write(bufferedImage, imageType, destFile);
	}
	
	/**
	 * 切割图片
	 * 
	 * @param srcFilePath
	 * @param destFilePath
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @throws Exception
	 */
	public static void cut(String srcFilePath, String destFilePath, int x, int y, int width, int height) throws Exception {
		
		File srcFile = getSrcFile(srcFilePath);
		File destFile = getDestFile(destFilePath);
		String imageType = getImageType(srcFile);
		if (x < 0 || y < 0) {
			
			throw new IllegalArgumentException("坐标参数不正确！");
		}
		if (width < 1 || height < 1) {
			
			throw new IllegalArgumentException("宽高参数不正确！");
		}
		BufferedImage bufferedImage = ImageIO.read(srcFile);
		bufferedImage = bufferedImage.getSubimage(x, y, width, height);
		ImageIO.write(bufferedImage, imageType, destFile);
	}
	
	/**
	 * 生成圆角图片
	 * 
	 * @param srcFilePath
	 * @param destFilePath
	 * @param radius
	 * @throws Exception
	 */
	public static void corner(String srcFilePath, String destFilePath, int radius) throws Exception {
		
		File srcFile = getSrcFile(srcFilePath);
		File destFile = getDestFile(destFilePath);
		getImageType(srcFile);
		BufferedImage image = ImageIO.read(srcFile);
		int width = image.getWidth();
		int height = image.getHeight();
		BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D graphics2D = bufferedImage.createGraphics();
		graphics2D.setComposite(AlphaComposite.Src);
		graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphics2D.setColor(Color.WHITE);
		graphics2D.fill(new RoundRectangle2D.Float(0, 0, width, height, radius, radius));
		graphics2D.setComposite(AlphaComposite.SrcAtop);
		graphics2D.drawImage(image, 0, 0, null);
		graphics2D.dispose();
		// 生成图片的类型为PNG
		ImageIO.write(bufferedImage, IMAGE_TYPE_PNG, destFile);
	}
	
	/**
	 * 旋转图片
	 * 
	 * @param srcFilePath
	 * @param destFilePath
	 * @param angle
	 * @throws Exception
	 */
	public static void rotate(String srcFilePath, String destFilePath, double angle) throws Exception {
		
		File srcFile = getSrcFile(srcFilePath);
		File destFile = getDestFile(destFilePath);
		getImageType(srcFile);
		BufferedImage image = ImageIO.read(srcFile);
		int width = image.getWidth();
		int height = image.getHeight();
		angle = Math.toRadians(angle);
		double[][] postions = new double[4][];
		postions[0] = calcPosition(0, 0, angle);
		postions[1] = calcPosition(width, 0, angle);
		postions[2] = calcPosition(0, height, angle);
		postions[3] = calcPosition(width, height, angle);
		double minX = Math.min(
				Math.min(postions[0][0], postions[1][0]),
				Math.min(postions[2][0], postions[3][0]));
		double maxX = Math.max(
				Math.max(postions[0][0], postions[1][0]),
				Math.max(postions[2][0], postions[3][0]));
		double minY = Math.min(
				Math.min(postions[0][1], postions[1][1]),
				Math.min(postions[2][1], postions[3][1]));
		double maxY = Math.max(
				Math.max(postions[0][1], postions[1][1]),
				Math.max(postions[2][1], postions[3][1]));
		int newWidth = (int) Math.ceil(maxX - minX);
		int newHeight = (int) Math.ceil(maxY - minY);
		BufferedImage bufferedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
		Graphics2D graphics2D = bufferedImage.createGraphics();
		graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphics2D.rotate(angle, newWidth / 2, newHeight / 2);
		int centerX = (int) Math.round((newWidth - width) / 2);
		int centerY = (int) Math.round((newHeight - height) / 2);
		graphics2D.drawImage(image, centerX, centerY, null);
		graphics2D.dispose();
		// 生成图片的类型为PNG
		ImageIO.write(bufferedImage, IMAGE_TYPE_PNG, destFile);
	}
	
	/**
	 * 翻转图片
	 * 
	 * @param srcFilePath
	 * @param destFilePath
	 * @param mode
	 * @throws Exception
	 */
	public static void flip(String srcFilePath, String destFilePath, int mode) throws Exception {
		
		File srcFile = getSrcFile(srcFilePath);
		File destFile = getDestFile(destFilePath);
		getImageType(srcFile);
		BufferedImage image = ImageIO.read(srcFile);
		int width = image.getWidth();
		int height = image.getHeight();
		AffineTransform transform = null;
		if (mode == FLIP_MODE_HORIZONTAL) {
			// 水平翻转
			transform = new AffineTransform(-1, 0, 0, 1, width, 0);
		} else {
			// 垂直翻转
			transform = new AffineTransform(1, 0, 0, -1, 0, height);
		}
		AffineTransformOp transformOp = new AffineTransformOp(transform, AffineTransformOp.TYPE_BILINEAR);
		// 生成图片的类型为PNG
		ImageIO.write(transformOp.filter(image, null), IMAGE_TYPE_PNG, destFile);
	}
	
	/**
	 * 获取图片类型
	 * 
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	public static String getImageType(String filePath) throws IOException {
		
		return getImageType(getSrcFile(filePath));
	}
	
	/**
	 * 获取图片类型
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static String getImageType(File file) throws IOException {
		
		return getImageType(toMemoryStream(new FileInputStream(file)));
	}
	
	/**
	 * 获取图片类型
	 * 
	 * @param stream
	 * @return
	 * @throws IOException
	 */
	public static String getImageType(InputStream stream) throws IOException {
		
		if (!stream.markSupported()) {
			
			stream = toMemoryStream(stream);
		}
		if (isJPEG(stream)) {
			
			return IMAGE_TYPE_JPEG;
		}
		if (isGIF(stream)) {
			
			return IMAGE_TYPE_GIF;
		}
		if (isPNG(stream)) {
			
			return IMAGE_TYPE_PNG;
		}
		if (isBMP(stream)) {
			
			return IMAGE_TYPE_BMP;
		}
		throw new IllegalArgumentException("图片类型不正确，只支持：JPEG, GIF, PNG, BMP");
	}
	
	/**
	 * 判断是否为支持的图片类型
	 * 
	 * @param imageType
	 * @return
	 */
	public static boolean isSupportImageType(String imageType) {
		
		for (String supportImageType : SUPPORT_IMAGE_TYPE) {
			
			if (supportImageType.equals(imageType)) {
				
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 判断是否为JPEG文件
	 * 
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	public static boolean isJPEG(String filePath) throws IOException {
		
		return isJPEG(getSrcFile(filePath));
	}
	
	/**
	 * 判断是否为JPEG文件
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static boolean isJPEG(File file) throws IOException {
		
		return isJPEG(toMemoryStream(new FileInputStream(file)));
	}
	
	/**
	 * 判断是否为JPEG文件
	 * 
	 * @param stream
	 * @return
	 * @throws IOException
	 */
	public static boolean isJPEG(InputStream stream) throws IOException {
		
		if (!stream.markSupported()) {
			
			stream = toMemoryStream(stream);
		}
		try {
			
			stream.mark(30);
			int byte1 = stream.read();
			int byte2 = stream.read();
			if (byte1 == 0xFF && byte2 == 0xD8) {
				
				return true;
			}
		} finally {
			
			stream.reset();
		}
		return false;
	}
	
	/**
	 * 判断是否为GIF文件
	 * 
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	public static boolean isGIF(String filePath) throws IOException {
		
		return isGIF(getSrcFile(filePath));
	}
	
	/**
	 * 判断是否为GIF文件
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static boolean isGIF(File file) throws IOException {
		
		return isGIF(toMemoryStream(new FileInputStream(file)));
	}
	
	/**
	 * 判断是否为GIF文件
	 * 
	 * @param stream
	 * @return
	 * @throws IOException
	 */
	public static boolean isGIF(InputStream stream) throws IOException {
		
		if (!stream.markSupported()) {
			
			stream = toMemoryStream(stream);
		}
		byte[] b = new byte[6];
		try {
			
			stream.mark(30);
			stream.read(b);
		} finally {
			
			stream.reset();
		}
		return b[0] == 'G' && b[1] == 'I' && b[2] == 'F'
				&& b[3] == '8' && (b[4] == '7' || b[4] == '9') && b[5] == 'a';
	}
	
	/**
	 * 判断是否为PNG文件
	 * 
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	public static boolean isPNG(String filePath) throws IOException {
		
		return isPNG(getSrcFile(filePath));
	}
	
	/**
	 * 判断是否为PNG文件
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static boolean isPNG(File file) throws IOException {
		
		return isPNG(toMemoryStream(new FileInputStream(file)));
	}
	
	/**
	 * 判断是否为PNG文件
	 * 
	 * @param stream
	 * @return
	 * @throws IOException
	 */
	public static boolean isPNG(InputStream stream) throws IOException {
		
		if (!stream.markSupported()) {
			
			stream = toMemoryStream(stream);
		}
		byte[] b = new byte[8];
		try {
			
			stream.mark(30);
			stream.read(b);
		} finally {
			
			stream.reset();
		}
		return b[0] == (byte) 137 && b[1] == (byte) 80 && b[2] == (byte) 78 && b[3] == (byte) 71
				&& b[4] == (byte) 13 && b[5] == (byte) 10 && b[6] == (byte) 26 && b[7] == (byte) 10;
	}
	
	/**
	 * 判断是否为BMP文件
	 * 
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	public static boolean isBMP(String filePath) throws IOException {
		
		return isBMP(getSrcFile(filePath));
	}
	
	/**
	 * 判断是否为BMP文件
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static boolean isBMP(File file) throws IOException {
		
		return isBMP(toMemoryStream(new FileInputStream(file)));
	}
	
	/**
	 * 判断是否为BMP文件
	 * 
	 * @param stream
	 * @return
	 * @throws IOException
	 */
	public static boolean isBMP(InputStream stream) throws IOException {
		
		if (!stream.markSupported()) {
			
			stream = toMemoryStream(stream);
		}
		byte[] b = new byte[2];
		try {
			
			stream.mark(30);
			stream.read(b);
		} finally {
			
			stream.reset();
		}
		return b[0] == 0x42 && b[1] == 0x4D;
	}
	
	/**
	 * 转换输入流以支持mark
	 * 
	 * @param stream
	 * @return
	 * @throws IOException
	 */
	public static InputStream toMemoryStream(InputStream stream) throws IOException {
		
		if (!(stream instanceof ByteArrayInputStream) && (!(stream instanceof java.io.ByteArrayInputStream))) {
			
			ByteArrayOutputStream tmp = new ByteArrayOutputStream();
			IOUtils.copy(stream, tmp);
			stream = tmp.toInputStream();
			tmp = null;
		}
		return stream;
	}
	
	/**
	 * 获取指定文件，并检查文件是否存在
	 * 
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	public static File getSrcFile(String filePath) throws FileNotFoundException {
		
		File file = new File(filePath);
		if (!file.exists()) {
			
			throw new FileNotFoundException("系统找不到指定的文件：".concat(filePath));
		}
		return file;
	}
	
	/**
	 * 获取指定文件，并检查文件路径是否有效
	 * 
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	public static File getDestFile(String filePath) throws FileNotFoundException {
		
		File file = new File(filePath);
		if (!file.getParentFile().exists()) {
			
			throw new FileNotFoundException("系统找不到指定的路径：".concat(filePath));
		}
		return file;
	}
	
	public static Integer getSimilarity(String filePath1, String filePath2) {
		
		String str1 = getFingerPrint(filePath1);
		String str2 = getFingerPrint(filePath2);
		System.out.println(str1);
		System.out.println(str2);
		if (null == str1 || null == str2) {
			
			return null;
		}
		int similarity = 0;// 完全不一样
		int hammingDistance = calcHammingDistance(str1, str2);
		if (hammingDistance == 0) {
			
			similarity = 100;// 完全一样
		} else if (hammingDistance <= 5) {
			
			similarity = 90;// 非常相似
		} else if (hammingDistance <= 10) {
			
			similarity = 50;// 有点相似
		}
		return similarity;
	}
	
	public static String getFingerPrint(String filePath) {
		
		File file = new File(filePath);
        BufferedImage source = null;
		try {
			
			source = ImageIO.read(file);
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}
        
		/**Step1：将图片缩小到8x8的尺寸，总共64个像素。这一步的作用是去除图片的细节，只保留结构、明暗等基本信息，摒弃不同尺寸、比例带来的图片差异。*/
		int width = 8;
		int height = 8;
		BufferedImage thumb = thumb(source, width, height, false);
		
		/**Step2：将缩小后的图片，转为64级灰度。也就是说，所有像素点总共只有64种颜色。*/
		int[] pixels = new int[width * height];
		for (int i = 0; i < width; i++) {
			
			for (int j = 0; j < height; j++) {
				
				pixels[i * height + j] = calcPixelGray(thumb.getRGB(i, j));
			}
		}
		
		/**Step3：计算所有64个像素的灰度平均值。*/
		int avgPixel = calcPixelsAvg(pixels);
		
		/**Step4：将每个像素的灰度，与平均值进行比较。大于或等于平均值，记为1；小于平均值，记为0。*/
		int[] comps = new int[width * height];
		for (int i = 0; i < comps.length; i++) {
			if (pixels[i] >= avgPixel) {
				comps[i] = 1;
			} else {
				comps[i] = 0;
			}
		}
		
		/**Step5：将上一步的比较结果，组合在一起，就构成了一个64位的整数，这就是这张图片的指纹。组合的次序并不重要，只要保证所有图片都采用同样次序就行了。*/
		StringBuffer hashCode = new StringBuffer();
		for (int i = 0; i < comps.length; i+= 4) {
			int result = comps[i] * (int) Math.pow(2, 3) + comps[i + 1] * (int) Math.pow(2, 2) + comps[i + 2] * (int) Math.pow(2, 1) + comps[i + 2];
			hashCode.append(ConvertUtil.binaryToHex(result));
		}
		
		// 得到指纹以后，就可以对比不同的图片，看看64位中有多少位是不一样的。
		return hashCode.toString();
	}
	
	public static BufferedImage thumb(BufferedImage source, int width,
			int height, boolean b) {
		// targetW，targetH分别表示目标长和宽
		int type = source.getType();
		BufferedImage target = null;
		double sx = (double) width / source.getWidth();
		double sy = (double) height / source.getHeight();

		if (b) {
			if (sx > sy) {
				sx = sy;
				width = (int) (sx * source.getWidth());
			} else {
				sy = sx;
				height = (int) (sy * source.getHeight());
			}
		}

		if (type == BufferedImage.TYPE_CUSTOM) { // handmade
			ColorModel cm = source.getColorModel();
			WritableRaster raster = cm.createCompatibleWritableRaster(width,
					height);
			boolean alphaPremultiplied = cm.isAlphaPremultiplied();
			target = new BufferedImage(cm, raster, alphaPremultiplied, null);
		} else
			target = new BufferedImage(width, height, type);
		Graphics2D g = target.createGraphics();
		// smoother than exlax:
		g.setRenderingHint(RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_QUALITY);
		g.drawRenderedImage(source, AffineTransform.getScaleInstance(sx, sy));
		g.dispose();
		return target;
	}
	
	/*****************************************************************/
	
	// 计算坐标
	public static double[] calcPosition(double x, double y, double angle) {
		
		double nx = Math.cos(angle) * x - Math.sin(angle) * y;
		double ny = Math.sin(angle) * x + Math.cos(angle) * y;
		return new double[]{nx, ny};
	}
	
	// 计算汉明距离
	public static int calcHammingDistance(String str1, String str2) {
		
		int hammingDistance = 0;
		for (int i=0; i<str1.length(); i++) {
			
			if (str1.charAt(i) != str2.charAt(i)) {
				
				hammingDistance++;
			}
		}
		return hammingDistance;
	}
	
	// 计算像素的灰度值
	public static int calcPixelGray(int pixel) {
		// int alpha = (pixels >> 24) & 0xFF;
		int red = (pixel >> 16) & 0xFF;
		int green = (pixel >> 8) & 0xFF;
		int blue = (pixel) & 0xFF;
		return (int) (0.3 * red + 0.59 * green + 0.11 * blue);
	}
	
	// 计算一组像素的平均值
	public static int calcPixelsAvg(int[] pixels) {
		
		float m = 0;
		for (int i = 0; i < pixels.length; ++i) {
			
			m += pixels[i];
		}
		m = m / pixels.length;
		return (int) m;
	}
	
	private ImageUtil() {}
}