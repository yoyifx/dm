package cn.datawe.constant;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import cn.datawe.util.ValidatorUtil;

/**
 * 枚举类:华北地区行政区划
 * <br>数据更新日期:2016-08-24
 * 
 * @author LiuJiaLe
 * 
 */
public enum ChinaNorthAreaCodeEnum {

	ITEM110000("110000", "北京市", "", ""),
	ITEM110101("110101", "北京市", "东城区", ""),
	ITEM110102("110102", "北京市", "西城区", ""),
	ITEM110105("110105", "北京市", "朝阳区", ""),
	ITEM110106("110106", "北京市", "丰台区", ""),
	ITEM110107("110107", "北京市", "石景山区", ""),
	ITEM110108("110108", "北京市", "海淀区", ""),
	ITEM110109("110109", "北京市", "门头沟区", ""),
	ITEM110111("110111", "北京市", "房山区", ""),
	ITEM110112("110112", "北京市", "通州区", ""),
	ITEM110113("110113", "北京市", "顺义区", ""),
	ITEM110114("110114", "北京市", "昌平区", ""),
	ITEM110115("110115", "北京市", "大兴区", ""),
	ITEM110116("110116", "北京市", "怀柔区", ""),
	ITEM110117("110117", "北京市", "平谷区", ""),
	ITEM110118("110118", "北京市", "密云区", ""),
	ITEM110119("110119", "北京市", "延庆区", ""),
	
	ITEM120000("120000", "天津市", "", ""),
	ITEM120101("120101", "天津市", "和平区", ""),
	ITEM120102("120102", "天津市", "河东区", ""),
	ITEM120103("120103", "天津市", "河西区", ""),
	ITEM120104("120104", "天津市", "南开区", ""),
	ITEM120105("120105", "天津市", "河北区", ""),
	ITEM120106("120106", "天津市", "红桥区", ""),
	ITEM120110("120110", "天津市", "东丽区", ""),
	ITEM120111("120111", "天津市", "西青区", ""),
	ITEM120112("120112", "天津市", "津南区", ""),
	ITEM120113("120113", "天津市", "北辰区", ""),
	ITEM120114("120114", "天津市", "武清区", ""),
	ITEM120115("120115", "天津市", "宝坻区", ""),
	ITEM120116("120116", "天津市", "滨海新区", ""),
	ITEM120117("120117", "天津市", "宁河区", ""),
	ITEM120118("120118", "天津市", "静海区", ""),
	ITEM120225("120225", "天津市", "蓟县", ""),
	
	ITEM130000("130000", "河北省", "", ""),
	ITEM130100("130100", "河北省", "石家庄市", ""),
	ITEM130102("130102", "河北省", "石家庄市", "长安区"),
	ITEM130104("130104", "河北省", "石家庄市", "桥西区"),
	ITEM130105("130105", "河北省", "石家庄市", "新华区"),
	ITEM130107("130107", "河北省", "石家庄市", "井陉矿区"),
	ITEM130108("130108", "河北省", "石家庄市", "裕华区"),
	ITEM130109("130109", "河北省", "石家庄市", "藁城区"),
	ITEM130110("130110", "河北省", "石家庄市", "鹿泉区"),
	ITEM130111("130111", "河北省", "石家庄市", "栾城区"),
	ITEM130121("130121", "河北省", "石家庄市", "井陉县"),
	ITEM130123("130123", "河北省", "石家庄市", "正定县"),
	ITEM130125("130125", "河北省", "石家庄市", "行唐县"),
	ITEM130126("130126", "河北省", "石家庄市", "灵寿县"),
	ITEM130127("130127", "河北省", "石家庄市", "高邑县"),
	ITEM130128("130128", "河北省", "石家庄市", "深泽县"),
	ITEM130129("130129", "河北省", "石家庄市", "赞皇县"),
	ITEM130130("130130", "河北省", "石家庄市", "无极县"),
	ITEM130131("130131", "河北省", "石家庄市", "平山县"),
	ITEM130132("130132", "河北省", "石家庄市", "元氏县"),
	ITEM130133("130133", "河北省", "石家庄市", "赵县"),
	ITEM130181("130181", "河北省", "石家庄市", "辛集市"),
	ITEM130183("130183", "河北省", "石家庄市", "晋州市"),
	ITEM130184("130184", "河北省", "石家庄市", "新乐市"),
	ITEM130200("130200", "河北省", "唐山市", ""),
	ITEM130202("130202", "河北省", "唐山市", "路南区"),
	ITEM130203("130203", "河北省", "唐山市", "路北区"),
	ITEM130204("130204", "河北省", "唐山市", "古冶区"),
	ITEM130205("130205", "河北省", "唐山市", "开平区"),
	ITEM130207("130207", "河北省", "唐山市", "丰南区"),
	ITEM130208("130208", "河北省", "唐山市", "丰润区"),
	ITEM130209("130209", "河北省", "唐山市", "曹妃甸区"),
	ITEM130223("130223", "河北省", "唐山市", "滦县"),
	ITEM130224("130224", "河北省", "唐山市", "滦南县"),
	ITEM130225("130225", "河北省", "唐山市", "乐亭县"),
	ITEM130227("130227", "河北省", "唐山市", "迁西县"),
	ITEM130229("130229", "河北省", "唐山市", "玉田县"),
	ITEM130281("130281", "河北省", "唐山市", "遵化市"),
	ITEM130283("130283", "河北省", "唐山市", "迁安市"),
	ITEM130300("130300", "河北省", "秦皇岛市", ""),
	ITEM130302("130302", "河北省", "秦皇岛市", "海港区"),
	ITEM130303("130303", "河北省", "秦皇岛市", "山海关区"),
	ITEM130304("130304", "河北省", "秦皇岛市", "北戴河区"),
	ITEM130306("130306", "河北省", "秦皇岛市", "抚宁区"),
	ITEM130321("130321", "河北省", "秦皇岛市", "青龙满族自治县"),
	ITEM130322("130322", "河北省", "秦皇岛市", "昌黎县"),
	ITEM130324("130324", "河北省", "秦皇岛市", "卢龙县"),
	ITEM130400("130400", "河北省", "邯郸市", ""),
	ITEM130402("130402", "河北省", "邯郸市", "邯山区"),
	ITEM130403("130403", "河北省", "邯郸市", "丛台区"),
	ITEM130404("130404", "河北省", "邯郸市", "复兴区"),
	ITEM130406("130406", "河北省", "邯郸市", "峰峰矿区"),
	ITEM130421("130421", "河北省", "邯郸市", "邯郸县"),
	ITEM130423("130423", "河北省", "邯郸市", "临漳县"),
	ITEM130424("130424", "河北省", "邯郸市", "成安县"),
	ITEM130425("130425", "河北省", "邯郸市", "大名县"),
	ITEM130426("130426", "河北省", "邯郸市", "涉县"),
	ITEM130427("130427", "河北省", "邯郸市", "磁县"),
	ITEM130428("130428", "河北省", "邯郸市", "肥乡县"),
	ITEM130429("130429", "河北省", "邯郸市", "永年县"),
	ITEM130430("130430", "河北省", "邯郸市", "邱县"),
	ITEM130431("130431", "河北省", "邯郸市", "鸡泽县"),
	ITEM130432("130432", "河北省", "邯郸市", "广平县"),
	ITEM130433("130433", "河北省", "邯郸市", "馆陶县"),
	ITEM130434("130434", "河北省", "邯郸市", "魏县"),
	ITEM130435("130435", "河北省", "邯郸市", "曲周县"),
	ITEM130481("130481", "河北省", "邯郸市", "武安市"),
	ITEM130500("130500", "河北省", "邢台市", ""),
	ITEM130502("130502", "河北省", "邢台市", "桥东区"),
	ITEM130503("130503", "河北省", "邢台市", "桥西区"),
	ITEM130521("130521", "河北省", "邢台市", "邢台县"),
	ITEM130522("130522", "河北省", "邢台市", "临城县"),
	ITEM130523("130523", "河北省", "邢台市", "内丘县"),
	ITEM130524("130524", "河北省", "邢台市", "柏乡县"),
	ITEM130525("130525", "河北省", "邢台市", "隆尧县"),
	ITEM130526("130526", "河北省", "邢台市", "任县"),
	ITEM130527("130527", "河北省", "邢台市", "南和县"),
	ITEM130528("130528", "河北省", "邢台市", "宁晋县"),
	ITEM130529("130529", "河北省", "邢台市", "巨鹿县"),
	ITEM130530("130530", "河北省", "邢台市", "新河县"),
	ITEM130531("130531", "河北省", "邢台市", "广宗县"),
	ITEM130532("130532", "河北省", "邢台市", "平乡县"),
	ITEM130533("130533", "河北省", "邢台市", "威县"),
	ITEM130534("130534", "河北省", "邢台市", "清河县"),
	ITEM130535("130535", "河北省", "邢台市", "临西县"),
	ITEM130581("130581", "河北省", "邢台市", "南宫市"),
	ITEM130582("130582", "河北省", "邢台市", "沙河市"),
	ITEM130600("130600", "河北省", "保定市", ""),
	ITEM130602("130602", "河北省", "保定市", "竞秀区"),
	ITEM130604("130604", "河北省", "保定市", "南市区"),
	ITEM130606("130606", "河北省", "保定市", "莲池区"),
	ITEM130607("130607", "河北省", "保定市", "满城区"),
	ITEM130608("130608", "河北省", "保定市", "清苑区"),
	ITEM130609("130609", "河北省", "保定市", "徐水区"),
	ITEM130623("130623", "河北省", "保定市", "涞水县"),
	ITEM130624("130624", "河北省", "保定市", "阜平县"),
	ITEM130626("130626", "河北省", "保定市", "定兴县"),
	ITEM130627("130627", "河北省", "保定市", "唐县"),
	ITEM130628("130628", "河北省", "保定市", "高阳县"),
	ITEM130629("130629", "河北省", "保定市", "容城县"),
	ITEM130630("130630", "河北省", "保定市", "涞源县"),
	ITEM130631("130631", "河北省", "保定市", "望都县"),
	ITEM130632("130632", "河北省", "保定市", "安新县"),
	ITEM130633("130633", "河北省", "保定市", "易县"),
	ITEM130634("130634", "河北省", "保定市", "曲阳县"),
	ITEM130635("130635", "河北省", "保定市", "蠡县"),
	ITEM130636("130636", "河北省", "保定市", "顺平县"),
	ITEM130637("130637", "河北省", "保定市", "博野县"),
	ITEM130638("130638", "河北省", "保定市", "雄县"),
	ITEM130681("130681", "河北省", "保定市", "涿州市"),
	ITEM130682("130682", "河北省", "保定市", "定州市"),
	ITEM130683("130683", "河北省", "保定市", "安国市"),
	ITEM130684("130684", "河北省", "保定市", "高碑店市"),
	ITEM130700("130700", "河北省", "张家口市", ""),
	ITEM130702("130702", "河北省", "张家口市", "桥东区"),
	ITEM130703("130703", "河北省", "张家口市", "桥西区"),
	ITEM130705("130705", "河北省", "张家口市", "宣化区"),
	ITEM130706("130706", "河北省", "张家口市", "下花园区"),
	ITEM130708("130708", "河北省", "张家口市", "万全县"),// 130729->130708, 万全县->万全区
	ITEM130709("130709", "河北省", "张家口市", "崇礼区"),// 130733->130709, 崇礼县->崇礼区
	ITEM130721("130721", "河北省", "张家口市", "宣化县"),
	ITEM130722("130722", "河北省", "张家口市", "张北县"),
	ITEM130723("130723", "河北省", "张家口市", "康保县"),
	ITEM130724("130724", "河北省", "张家口市", "沽源县"),
	ITEM130725("130725", "河北省", "张家口市", "尚义县"),
	ITEM130726("130726", "河北省", "张家口市", "蔚县"),
	ITEM130727("130727", "河北省", "张家口市", "阳原县"),
	ITEM130728("130728", "河北省", "张家口市", "怀安县"),
	ITEM130730("130730", "河北省", "张家口市", "怀来县"),
	ITEM130731("130731", "河北省", "张家口市", "涿鹿县"),
	ITEM130732("130732", "河北省", "张家口市", "赤城县"),
	ITEM130800("130800", "河北省", "承德市", ""),
	ITEM130802("130802", "河北省", "承德市", "双桥区"),
	ITEM130803("130803", "河北省", "承德市", "双滦区"),
	ITEM130804("130804", "河北省", "承德市", "鹰手营子矿区"),
	ITEM130821("130821", "河北省", "承德市", "承德县"),
	ITEM130822("130822", "河北省", "承德市", "兴隆县"),
	ITEM130823("130823", "河北省", "承德市", "平泉县"),
	ITEM130824("130824", "河北省", "承德市", "滦平县"),
	ITEM130825("130825", "河北省", "承德市", "隆化县"),
	ITEM130826("130826", "河北省", "承德市", "丰宁满族自治县"),
	ITEM130827("130827", "河北省", "承德市", "宽城满族自治县"),
	ITEM130828("130828", "河北省", "承德市", "围场满族蒙古族自治县"),
	ITEM130900("130900", "河北省", "沧州市", ""),
	ITEM130902("130902", "河北省", "沧州市", "新华区"),
	ITEM130903("130903", "河北省", "沧州市", "运河区"),
	ITEM130921("130921", "河北省", "沧州市", "沧县"),
	ITEM130922("130922", "河北省", "沧州市", "青县"),
	ITEM130923("130923", "河北省", "沧州市", "东光县"),
	ITEM130924("130924", "河北省", "沧州市", "海兴县"),
	ITEM130925("130925", "河北省", "沧州市", "盐山县"),
	ITEM130926("130926", "河北省", "沧州市", "肃宁县"),
	ITEM130927("130927", "河北省", "沧州市", "南皮县"),
	ITEM130928("130928", "河北省", "沧州市", "吴桥县"),
	ITEM130929("130929", "河北省", "沧州市", "献县"),
	ITEM130930("130930", "河北省", "沧州市", "孟村回族自治县"),
	ITEM130981("130981", "河北省", "沧州市", "泊头市"),
	ITEM130982("130982", "河北省", "沧州市", "任丘市"),
	ITEM130983("130983", "河北省", "沧州市", "黄骅市"),
	ITEM130984("130984", "河北省", "沧州市", "河间市"),
	ITEM131000("131000", "河北省", "廊坊市", ""),
	ITEM131002("131002", "河北省", "廊坊市", "安次区"),
	ITEM131003("131003", "河北省", "廊坊市", "广阳区"),
	ITEM131022("131022", "河北省", "廊坊市", "固安县"),
	ITEM131023("131023", "河北省", "廊坊市", "永清县"),
	ITEM131024("131024", "河北省", "廊坊市", "香河县"),
	ITEM131025("131025", "河北省", "廊坊市", "大城县"),
	ITEM131026("131026", "河北省", "廊坊市", "文安县"),
	ITEM131028("131028", "河北省", "廊坊市", "大厂回族自治县"),
	ITEM131081("131081", "河北省", "廊坊市", "霸州市"),
	ITEM131082("131082", "河北省", "廊坊市", "三河市"),
	ITEM131100("131100", "河北省", "衡水市", ""),
	ITEM131102("131102", "河北省", "衡水市", "桃城区"),
	ITEM131103("131103", "河北省", "衡水市", "冀州市"),// 131181->131103, 冀州市->冀州区
	ITEM131121("131121", "河北省", "衡水市", "枣强县"),
	ITEM131122("131122", "河北省", "衡水市", "武邑县"),
	ITEM131123("131123", "河北省", "衡水市", "武强县"),
	ITEM131124("131124", "河北省", "衡水市", "饶阳县"),
	ITEM131125("131125", "河北省", "衡水市", "安平县"),
	ITEM131126("131126", "河北省", "衡水市", "故城县"),
	ITEM131127("131127", "河北省", "衡水市", "景县"),
	ITEM131128("131128", "河北省", "衡水市", "阜城县"),
	ITEM131182("131182", "河北省", "衡水市", "深州市"),
	
	ITEM140000("140000", "山西省", "", ""),
	ITEM140100("140100", "山西省", "太原市", ""),
	ITEM140105("140105", "山西省", "太原市", "小店区"),
	ITEM140106("140106", "山西省", "太原市", "迎泽区"),
	ITEM140107("140107", "山西省", "太原市", "杏花岭区"),
	ITEM140108("140108", "山西省", "太原市", "尖草坪区"),
	ITEM140109("140109", "山西省", "太原市", "万柏林区"),
	ITEM140110("140110", "山西省", "太原市", "晋源区"),
	ITEM140121("140121", "山西省", "太原市", "清徐县"),
	ITEM140122("140122", "山西省", "太原市", "阳曲县"),
	ITEM140123("140123", "山西省", "太原市", "娄烦县"),
	ITEM140181("140181", "山西省", "太原市", "古交市"),
	ITEM140200("140200", "山西省", "大同市", ""),
	ITEM140202("140202", "山西省", "大同市", "城区"),
	ITEM140203("140203", "山西省", "大同市", "矿区"),
	ITEM140211("140211", "山西省", "大同市", "南郊区"),
	ITEM140212("140212", "山西省", "大同市", "新荣区"),
	ITEM140221("140221", "山西省", "大同市", "阳高县"),
	ITEM140222("140222", "山西省", "大同市", "天镇县"),
	ITEM140223("140223", "山西省", "大同市", "广灵县"),
	ITEM140224("140224", "山西省", "大同市", "灵丘县"),
	ITEM140225("140225", "山西省", "大同市", "浑源县"),
	ITEM140226("140226", "山西省", "大同市", "左云县"),
	ITEM140227("140227", "山西省", "大同市", "大同县"),
	ITEM140300("140300", "山西省", "阳泉市", ""),
	ITEM140302("140302", "山西省", "阳泉市", "城区"),
	ITEM140303("140303", "山西省", "阳泉市", "矿区"),
	ITEM140311("140311", "山西省", "阳泉市", "郊区"),
	ITEM140321("140321", "山西省", "阳泉市", "平定县"),
	ITEM140322("140322", "山西省", "阳泉市", "盂县"),
	ITEM140400("140400", "山西省", "长治市", ""),
	ITEM140402("140402", "山西省", "长治市", "城区"),
	ITEM140411("140411", "山西省", "长治市", "郊区"),
	ITEM140421("140421", "山西省", "长治市", "长治县"),
	ITEM140423("140423", "山西省", "长治市", "襄垣县"),
	ITEM140424("140424", "山西省", "长治市", "屯留县"),
	ITEM140425("140425", "山西省", "长治市", "平顺县"),
	ITEM140426("140426", "山西省", "长治市", "黎城县"),
	ITEM140427("140427", "山西省", "长治市", "壶关县"),
	ITEM140428("140428", "山西省", "长治市", "长子县"),
	ITEM140429("140429", "山西省", "长治市", "武乡县"),
	ITEM140430("140430", "山西省", "长治市", "沁县"),
	ITEM140431("140431", "山西省", "长治市", "沁源县"),
	ITEM140481("140481", "山西省", "长治市", "潞城市"),
	ITEM140500("140500", "山西省", "晋城市", ""),
	ITEM140502("140502", "山西省", "晋城市", "城区"),
	ITEM140521("140521", "山西省", "晋城市", "沁水县"),
	ITEM140522("140522", "山西省", "晋城市", "阳城县"),
	ITEM140524("140524", "山西省", "晋城市", "陵川县"),
	ITEM140525("140525", "山西省", "晋城市", "泽州县"),
	ITEM140581("140581", "山西省", "晋城市", "高平市"),
	ITEM140600("140600", "山西省", "朔州市", ""),
	ITEM140602("140602", "山西省", "朔州市", "朔城区"),
	ITEM140603("140603", "山西省", "朔州市", "平鲁区"),
	ITEM140621("140621", "山西省", "朔州市", "山阴县"),
	ITEM140622("140622", "山西省", "朔州市", "应县"),
	ITEM140623("140623", "山西省", "朔州市", "右玉县"),
	ITEM140624("140624", "山西省", "朔州市", "怀仁县"),
	ITEM140700("140700", "山西省", "晋中市", ""),
	ITEM140702("140702", "山西省", "晋中市", "榆次区"),
	ITEM140721("140721", "山西省", "晋中市", "榆社县"),
	ITEM140722("140722", "山西省", "晋中市", "左权县"),
	ITEM140723("140723", "山西省", "晋中市", "和顺县"),
	ITEM140724("140724", "山西省", "晋中市", "昔阳县"),
	ITEM140725("140725", "山西省", "晋中市", "寿阳县"),
	ITEM140726("140726", "山西省", "晋中市", "太谷县"),
	ITEM140727("140727", "山西省", "晋中市", "祁县"),
	ITEM140728("140728", "山西省", "晋中市", "平遥县"),
	ITEM140729("140729", "山西省", "晋中市", "灵石县"),
	ITEM140781("140781", "山西省", "晋中市", "介休市"),
	ITEM140800("140800", "山西省", "运城市", ""),
	ITEM140802("140802", "山西省", "运城市", "盐湖区"),
	ITEM140821("140821", "山西省", "运城市", "临猗县"),
	ITEM140822("140822", "山西省", "运城市", "万荣县"),
	ITEM140823("140823", "山西省", "运城市", "闻喜县"),
	ITEM140824("140824", "山西省", "运城市", "稷山县"),
	ITEM140825("140825", "山西省", "运城市", "新绛县"),
	ITEM140826("140826", "山西省", "运城市", "绛县"),
	ITEM140827("140827", "山西省", "运城市", "垣曲县"),
	ITEM140828("140828", "山西省", "运城市", "夏县"),
	ITEM140829("140829", "山西省", "运城市", "平陆县"),
	ITEM140830("140830", "山西省", "运城市", "芮城县"),
	ITEM140881("140881", "山西省", "运城市", "永济市"),
	ITEM140882("140882", "山西省", "运城市", "河津市"),
	ITEM140900("140900", "山西省", "忻州市", ""),
	ITEM140902("140902", "山西省", "忻州市", "忻府区"),
	ITEM140921("140921", "山西省", "忻州市", "定襄县"),
	ITEM140922("140922", "山西省", "忻州市", "五台县"),
	ITEM140923("140923", "山西省", "忻州市", "代县"),
	ITEM140924("140924", "山西省", "忻州市", "繁峙县"),
	ITEM140925("140925", "山西省", "忻州市", "宁武县"),
	ITEM140926("140926", "山西省", "忻州市", "静乐县"),
	ITEM140927("140927", "山西省", "忻州市", "神池县"),
	ITEM140928("140928", "山西省", "忻州市", "五寨县"),
	ITEM140929("140929", "山西省", "忻州市", "岢岚县"),
	ITEM140930("140930", "山西省", "忻州市", "河曲县"),
	ITEM140931("140931", "山西省", "忻州市", "保德县"),
	ITEM140932("140932", "山西省", "忻州市", "偏关县"),
	ITEM140981("140981", "山西省", "忻州市", "原平市"),
	ITEM141000("141000", "山西省", "临汾市", ""),
	ITEM141002("141002", "山西省", "临汾市", "尧都区"),
	ITEM141021("141021", "山西省", "临汾市", "曲沃县"),
	ITEM141022("141022", "山西省", "临汾市", "翼城县"),
	ITEM141023("141023", "山西省", "临汾市", "襄汾县"),
	ITEM141024("141024", "山西省", "临汾市", "洪洞县"),
	ITEM141025("141025", "山西省", "临汾市", "古县"),
	ITEM141026("141026", "山西省", "临汾市", "安泽县"),
	ITEM141027("141027", "山西省", "临汾市", "浮山县"),
	ITEM141028("141028", "山西省", "临汾市", "吉县"),
	ITEM141029("141029", "山西省", "临汾市", "乡宁县"),
	ITEM141030("141030", "山西省", "临汾市", "大宁县"),
	ITEM141031("141031", "山西省", "临汾市", "隰县"),
	ITEM141032("141032", "山西省", "临汾市", "永和县"),
	ITEM141033("141033", "山西省", "临汾市", "蒲县"),
	ITEM141034("141034", "山西省", "临汾市", "汾西县"),
	ITEM141081("141081", "山西省", "临汾市", "侯马市"),
	ITEM141082("141082", "山西省", "临汾市", "霍州市"),
	ITEM141100("141100", "山西省", "吕梁市", ""),
	ITEM141102("141102", "山西省", "吕梁市", "离石区"),
	ITEM141121("141121", "山西省", "吕梁市", "文水县"),
	ITEM141122("141122", "山西省", "吕梁市", "交城县"),
	ITEM141123("141123", "山西省", "吕梁市", "兴县"),
	ITEM141124("141124", "山西省", "吕梁市", "临县"),
	ITEM141125("141125", "山西省", "吕梁市", "柳林县"),
	ITEM141126("141126", "山西省", "吕梁市", "石楼县"),
	ITEM141127("141127", "山西省", "吕梁市", "岚县"),
	ITEM141128("141128", "山西省", "吕梁市", "方山县"),
	ITEM141129("141129", "山西省", "吕梁市", "中阳县"),
	ITEM141130("141130", "山西省", "吕梁市", "交口县"),
	ITEM141181("141181", "山西省", "吕梁市", "孝义市"),
	ITEM141182("141182", "山西省", "吕梁市", "汾阳市"),
	
	ITEM150000("150000", "内蒙古自治区", "", ""),
	ITEM150100("150100", "内蒙古自治区", "呼和浩特市", ""),
	ITEM150102("150102", "内蒙古自治区", "呼和浩特市", "新城区"),
	ITEM150103("150103", "内蒙古自治区", "呼和浩特市", "回民区"),
	ITEM150104("150104", "内蒙古自治区", "呼和浩特市", "玉泉区"),
	ITEM150105("150105", "内蒙古自治区", "呼和浩特市", "赛罕区"),
	ITEM150121("150121", "内蒙古自治区", "呼和浩特市", "土默特左旗"),
	ITEM150122("150122", "内蒙古自治区", "呼和浩特市", "托克托县"),
	ITEM150123("150123", "内蒙古自治区", "呼和浩特市", "和林格尔县"),
	ITEM150124("150124", "内蒙古自治区", "呼和浩特市", "清水河县"),
	ITEM150125("150125", "内蒙古自治区", "呼和浩特市", "武川县"),
	ITEM150200("150200", "内蒙古自治区", "包头市", ""),
	ITEM150202("150202", "内蒙古自治区", "包头市", "东河区"),
	ITEM150203("150203", "内蒙古自治区", "包头市", "昆都仑区"),
	ITEM150204("150204", "内蒙古自治区", "包头市", "青山区"),
	ITEM150205("150205", "内蒙古自治区", "包头市", "石拐区"),
	ITEM150206("150206", "内蒙古自治区", "包头市", "白云鄂博矿区"),
	ITEM150207("150207", "内蒙古自治区", "包头市", "九原区"),
	ITEM150221("150221", "内蒙古自治区", "包头市", "土默特右旗"),
	ITEM150222("150222", "内蒙古自治区", "包头市", "固阳县"),
	ITEM150223("150223", "内蒙古自治区", "包头市", "达尔罕茂明安联合旗"),
	ITEM150300("150300", "内蒙古自治区", "乌海市", ""),
	ITEM150302("150302", "内蒙古自治区", "乌海市", "海勃湾区"),
	ITEM150303("150303", "内蒙古自治区", "乌海市", "海南区"),
	ITEM150304("150304", "内蒙古自治区", "乌海市", "乌达区"),
	ITEM150400("150400", "内蒙古自治区", "赤峰市", ""),
	ITEM150402("150402", "内蒙古自治区", "赤峰市", "红山区"),
	ITEM150403("150403", "内蒙古自治区", "赤峰市", "元宝山区"),
	ITEM150404("150404", "内蒙古自治区", "赤峰市", "松山区"),
	ITEM150421("150421", "内蒙古自治区", "赤峰市", "阿鲁科尔沁旗"),
	ITEM150422("150422", "内蒙古自治区", "赤峰市", "巴林左旗"),
	ITEM150423("150423", "内蒙古自治区", "赤峰市", "巴林右旗"),
	ITEM150424("150424", "内蒙古自治区", "赤峰市", "林西县"),
	ITEM150425("150425", "内蒙古自治区", "赤峰市", "克什克腾旗"),
	ITEM150426("150426", "内蒙古自治区", "赤峰市", "翁牛特旗"),
	ITEM150428("150428", "内蒙古自治区", "赤峰市", "喀喇沁旗"),
	ITEM150429("150429", "内蒙古自治区", "赤峰市", "宁城县"),
	ITEM150430("150430", "内蒙古自治区", "赤峰市", "敖汉旗"),
	ITEM150500("150500", "内蒙古自治区", "通辽市", ""),
	ITEM150502("150502", "内蒙古自治区", "通辽市", "科尔沁区"),
	ITEM150521("150521", "内蒙古自治区", "通辽市", "科尔沁左翼中旗"),
	ITEM150522("150522", "内蒙古自治区", "通辽市", "科尔沁左翼后旗"),
	ITEM150523("150523", "内蒙古自治区", "通辽市", "开鲁县"),
	ITEM150524("150524", "内蒙古自治区", "通辽市", "库伦旗"),
	ITEM150525("150525", "内蒙古自治区", "通辽市", "奈曼旗"),
	ITEM150526("150526", "内蒙古自治区", "通辽市", "扎鲁特旗"),
	ITEM150581("150581", "内蒙古自治区", "通辽市", "霍林郭勒市"),
	ITEM150600("150600", "内蒙古自治区", "鄂尔多斯市", ""),
	ITEM150602("150602", "内蒙古自治区", "鄂尔多斯市", "东胜区"),
	ITEM150621("150621", "内蒙古自治区", "鄂尔多斯市", "达拉特旗"),
	ITEM150622("150622", "内蒙古自治区", "鄂尔多斯市", "准格尔旗"),
	ITEM150623("150623", "内蒙古自治区", "鄂尔多斯市", "鄂托克前旗"),
	ITEM150624("150624", "内蒙古自治区", "鄂尔多斯市", "鄂托克旗"),
	ITEM150625("150625", "内蒙古自治区", "鄂尔多斯市", "杭锦旗"),
	ITEM150626("150626", "内蒙古自治区", "鄂尔多斯市", "乌审旗"),
	ITEM150627("150627", "内蒙古自治区", "鄂尔多斯市", "伊金霍洛旗"),
	ITEM150700("150700", "内蒙古自治区", "呼伦贝尔市", ""),
	ITEM150702("150702", "内蒙古自治区", "呼伦贝尔市", "海拉尔区"),
	ITEM150703("150703", "内蒙古自治区", "呼伦贝尔市", "扎赉诺尔区"),
	ITEM150721("150721", "内蒙古自治区", "呼伦贝尔市", "阿荣旗"),
	ITEM150722("150722", "内蒙古自治区", "呼伦贝尔市", "莫力达瓦达斡尔族自治旗"),
	ITEM150723("150723", "内蒙古自治区", "呼伦贝尔市", "鄂伦春自治旗"),
	ITEM150724("150724", "内蒙古自治区", "呼伦贝尔市", "鄂温克族自治旗"),
	ITEM150725("150725", "内蒙古自治区", "呼伦贝尔市", "陈巴尔虎旗"),
	ITEM150726("150726", "内蒙古自治区", "呼伦贝尔市", "新巴尔虎左旗"),
	ITEM150727("150727", "内蒙古自治区", "呼伦贝尔市", "新巴尔虎右旗"),
	ITEM150781("150781", "内蒙古自治区", "呼伦贝尔市", "满洲里市"),
	ITEM150782("150782", "内蒙古自治区", "呼伦贝尔市", "牙克石市"),
	ITEM150783("150783", "内蒙古自治区", "呼伦贝尔市", "扎兰屯市"),
	ITEM150784("150784", "内蒙古自治区", "呼伦贝尔市", "额尔古纳市"),
	ITEM150785("150785", "内蒙古自治区", "呼伦贝尔市", "根河市"),
	ITEM150800("150800", "内蒙古自治区", "巴彦淖尔市", ""),
	ITEM150802("150802", "内蒙古自治区", "巴彦淖尔市", "临河区"),
	ITEM150821("150821", "内蒙古自治区", "巴彦淖尔市", "五原县"),
	ITEM150822("150822", "内蒙古自治区", "巴彦淖尔市", "磴口县"),
	ITEM150823("150823", "内蒙古自治区", "巴彦淖尔市", "乌拉特前旗"),
	ITEM150824("150824", "内蒙古自治区", "巴彦淖尔市", "乌拉特中旗"),
	ITEM150825("150825", "内蒙古自治区", "巴彦淖尔市", "乌拉特后旗"),
	ITEM150826("150826", "内蒙古自治区", "巴彦淖尔市", "杭锦后旗"),
	ITEM150900("150900", "内蒙古自治区", "乌兰察布市", ""),
	ITEM150902("150902", "内蒙古自治区", "乌兰察布市", "集宁区"),
	ITEM150921("150921", "内蒙古自治区", "乌兰察布市", "卓资县"),
	ITEM150922("150922", "内蒙古自治区", "乌兰察布市", "化德县"),
	ITEM150923("150923", "内蒙古自治区", "乌兰察布市", "商都县"),
	ITEM150924("150924", "内蒙古自治区", "乌兰察布市", "兴和县"),
	ITEM150925("150925", "内蒙古自治区", "乌兰察布市", "凉城县"),
	ITEM150926("150926", "内蒙古自治区", "乌兰察布市", "察哈尔右翼前旗"),
	ITEM150927("150927", "内蒙古自治区", "乌兰察布市", "察哈尔右翼中旗"),
	ITEM150928("150928", "内蒙古自治区", "乌兰察布市", "察哈尔右翼后旗"),
	ITEM150929("150929", "内蒙古自治区", "乌兰察布市", "四子王旗"),
	ITEM150981("150981", "内蒙古自治区", "乌兰察布市", "丰镇市"),
	ITEM152200("152200", "内蒙古自治区", "兴安盟", ""),
	ITEM152201("152201", "内蒙古自治区", "兴安盟", "乌兰浩特市"),
	ITEM152202("152202", "内蒙古自治区", "兴安盟", "阿尔山市"),
	ITEM152221("152221", "内蒙古自治区", "兴安盟", "科尔沁右翼前旗"),
	ITEM152222("152222", "内蒙古自治区", "兴安盟", "科尔沁右翼中旗"),
	ITEM152223("152223", "内蒙古自治区", "兴安盟", "扎赉特旗"),
	ITEM152224("152224", "内蒙古自治区", "兴安盟", "突泉县"),
	ITEM152500("152500", "内蒙古自治区", "锡林郭勒盟", ""),
	ITEM152501("152501", "内蒙古自治区", "锡林郭勒盟", "二连浩特市"),
	ITEM152502("152502", "内蒙古自治区", "锡林郭勒盟", "锡林浩特市"),
	ITEM152522("152522", "内蒙古自治区", "锡林郭勒盟", "阿巴嘎旗"),
	ITEM152523("152523", "内蒙古自治区", "锡林郭勒盟", "苏尼特左旗"),
	ITEM152524("152524", "内蒙古自治区", "锡林郭勒盟", "苏尼特右旗"),
	ITEM152525("152525", "内蒙古自治区", "锡林郭勒盟", "东乌珠穆沁旗"),
	ITEM152526("152526", "内蒙古自治区", "锡林郭勒盟", "西乌珠穆沁旗"),
	ITEM152527("152527", "内蒙古自治区", "锡林郭勒盟", "太仆寺旗"),
	ITEM152528("152528", "内蒙古自治区", "锡林郭勒盟", "镶黄旗"),
	ITEM152529("152529", "内蒙古自治区", "锡林郭勒盟", "正镶白旗"),
	ITEM152530("152530", "内蒙古自治区", "锡林郭勒盟", "正蓝旗"),
	ITEM152531("152531", "内蒙古自治区", "锡林郭勒盟", "多伦县"),
	ITEM152900("152900", "内蒙古自治区", "阿拉善盟", ""),
	ITEM152921("152921", "内蒙古自治区", "阿拉善盟", "阿拉善左旗"),
	ITEM152922("152922", "内蒙古自治区", "阿拉善盟", "阿拉善右旗"),
	ITEM152923("152923", "内蒙古自治区", "阿拉善盟", "额济纳旗"),
	;

	private String code;
	private String firstDistrict;
	private String secondDistrict;
	private String thirdDistrict;

	private ChinaNorthAreaCodeEnum(String code, String firstDistrict, String secondDistrict, String thirdDistrict) {
		this.code = code;
		this.firstDistrict = firstDistrict;
		this.secondDistrict = secondDistrict;
		this.thirdDistrict = thirdDistrict;
	}

	public String getCode() {
		return code;
	}

	public String getFirstDistrict() {
		return firstDistrict;
	}

	public String getSecondDistrict() {
		return secondDistrict;
	}
	
	public String getThirdDistrict() {
		return thirdDistrict;
	}
	
	public String getFullName() {
		
		return firstDistrict.concat(secondDistrict).concat(thirdDistrict);
	}
	
	public static Map<Object, Object> getResult(String code) {

		if (ValidatorUtil.isAreaCode(code)) {

			for (ChinaNorthAreaCodeEnum e : ChinaNorthAreaCodeEnum.values()) {

				if (code.equals(e.getCode())) {

					return getResult(e);
				}
			}
		}
		return null;
	}
	
	public static String getCode(String name) {
		
		if (ValidatorUtil.isNotEmptyIgnoreBlank(name)) {
			
			String fullName = null;
			for (ChinaNorthAreaCodeEnum e : ChinaNorthAreaCodeEnum.values()) {
				
				fullName = e.getFirstDistrict().concat(e.getSecondDistrict()).concat(e.getThirdDistrict());
				if (fullName.equals(name)) {
					
					return e.getCode();
				}
			}
		}
		return null;
	}
	
	public static String getName(String code) {
		
		if (ValidatorUtil.isAreaCode(code)) {
			
			for (ChinaNorthAreaCodeEnum e : ChinaNorthAreaCodeEnum.values()) {
				
				if (code.equals(e.getCode())) {
					
					return getName(e);
				}
			}
		}
		return null;
	}
	
	public static String getFullName(String code) {
		
		if (ValidatorUtil.isAreaCode(code)) {
			
			for (ChinaNorthAreaCodeEnum e : ChinaNorthAreaCodeEnum.values()) {
				
				if (code.equals(e.getCode())) {
					
					return e.getFirstDistrict().concat(e.getSecondDistrict()).concat(e.getThirdDistrict());
				}
			}
		}
		return null;
	}
	
	public static String matchCode(String name) {
		
		final String REGEX = "自治区|满族蒙古族自治县|满族自治县|回族自治县|省|市|区|县";
		String code = null;
		String str1 = null;
		String str2 = null;
		String str3 = null;
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new LinkedHashMap<String, String>();
		Map<String, String> map3 = new HashMap<String, String>();
		if (ValidatorUtil.isNotEmptyIgnoreBlank(name)) {
			
			code = matchSpecial(name);
			if (null == code) {
				
				for (ChinaNorthAreaCodeEnum e : ChinaNorthAreaCodeEnum.values()) {
					
					str1 = e.getFirstDistrict();
					str2 = e.getSecondDistrict();
					str3 = e.getThirdDistrict();
					if (ValidatorUtil.isNotEmpty(str3)) {
						
						map3.put(e.getCode(), (str1.concat(str2).concat(str3)).replaceAll(REGEX, ""));
						map2.put(e.getCode(), (str1.concat(str3)).replaceAll(REGEX, ""));
					}
					if (ValidatorUtil.isEmpty(str3) && ValidatorUtil.isNotEmpty(str2)) {
						
						map2.put(e.getCode(), (str1.concat(str2)).replaceAll(REGEX, ""));
					}
					if (ValidatorUtil.isAllEmpty(str2, str3)) {
						
						map1.put(e.getCode(), str1.replaceAll(REGEX, ""));
					}
				}
				
				name = name.replaceAll(REGEX, "");
				code = getCode(name, map1, map2, map3);
				if (null == code) {
					
					name = name.replaceAll("(?s)(.)(?=.*\\1)", "");
					code = getCode(name, map1, map2, map3);
				}
			}
		}
		return code;
	}
	
	private static String getCode(String name, Map<String, String> map1, Map<String, String> map2, Map<String, String> map3) {
		
		String code = matchCode(name, map3);
		if (null == code) {
			
			code = matchCode(name, map2);
		}
		if (null == code) {
			
			code = matchCode(name, map1);
		}
		return code;
	}
	
	private static String matchCode(String name, Map<String, String> map) {
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			
			if (name.equals(entry.getValue())) {
				
				return entry.getKey();
			}
		}
		for (Map.Entry<String, String> entry : map.entrySet()) {
			
			if (name.startsWith(entry.getValue())) {
				
				return entry.getKey();
			}
		}
		return null;
	}
	
	private static String matchSpecial(String name) {
		
		if (name.startsWith("河北")) {
			
			if (name.contains(ChinaNorthAreaCodeEnum.ITEM130421.getThirdDistrict())) {
				// 河北省邯郸市邯郸县
				return ChinaNorthAreaCodeEnum.ITEM130421.getCode();
			}
			if (name.contains(ChinaNorthAreaCodeEnum.ITEM130521.getThirdDistrict())) {
				// 河北省邢台市邢台县
				return ChinaNorthAreaCodeEnum.ITEM130521.getCode();
			}
			if (name.contains(ChinaNorthAreaCodeEnum.ITEM130821.getThirdDistrict())) {
				// 河北省承德市承德县
				return ChinaNorthAreaCodeEnum.ITEM130821.getCode();
			}
		}
		if (name.startsWith("山西")) {
			
			if (name.contains(ChinaNorthAreaCodeEnum.ITEM140227.getThirdDistrict())) {
				// 山西省大同市大同县
				return ChinaNorthAreaCodeEnum.ITEM140227.getCode();
			}
			if (name.contains(ChinaNorthAreaCodeEnum.ITEM140421.getThirdDistrict())) {
				// 山西省长治市长治县
				return ChinaNorthAreaCodeEnum.ITEM140421.getCode();
			}
		}
		return null;
	}
	
	private static String getName(ChinaNorthAreaCodeEnum e) {
		
		String name = e.getThirdDistrict();
		if (ValidatorUtil.isEmpty(name)) {
			
			name = e.getSecondDistrict();
		}
		if (ValidatorUtil.isEmpty(name)) {
			
			name = e.getFirstDistrict();
		}
		return ValidatorUtil.isEmpty(name) ? null : name;
	}
	
	private static Map<Object, Object> getResult(ChinaNorthAreaCodeEnum e) {
		
		String district = null;
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("code", e.getCode());
		
		district = e.getFirstDistrict();
		if (ValidatorUtil.isNotEmpty(district)) {
			
			map.put("firstDistrict", district);
		}
		district = e.getSecondDistrict();
		if (ValidatorUtil.isNotEmpty(district)) {
			
			map.put("secondDistrict", district);
		}
		district = e.getThirdDistrict();
		if (ValidatorUtil.isNotEmpty(district)) {
			
			map.put("thirdDistrict", district);
		}
		return map;
	}
}