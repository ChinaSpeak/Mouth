package com.example.chenxin20190308.bean;

import java.util.List;

/**
 * @Author：呵 呵
 * @E-mail：
 * @Date：2019/3/8 10:04
 * @Description：描述信息
 */
public class Bean {

    private int httpStatusCode;
    private int code;
    private DataBeanX data;

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX {
        /**
         * page : 1
         * perpage : 20
         * max_page : 234
         * total : 4673
         * data : [{"id":3706338,"title":"浠婅捣鍚堣偉甯傛皯鎷嶈繚鍋滅瓑杩濇硶琛屼负涓炬姤鍙幏濂栧姳 闄勮缁嗘敾鐣�","alias":"hotnews","type":"normal","pic_amount":0,"style":"single_right","pics":["special/tuku/201902/201902201521242924507660.jpg"],"comment_amount":4,"t":"url","source":"","type_sign":"","inner_news":1,"views":6107,"comment_amount_label":"4","views_label":"6107","link":"lsapp://cn.ahurls.news/news?id=3706338","catalog_name":"鍚堣偉24灏忔椂"},{"id":3706372,"title":"姹傚府蹇欙紒涔樻壎姊鏉庣婊戣惤鐮镐激6鏃\u20ac佷汉 楂樻槀鎵嬫湳璐硅瀹夊窘濂冲鐘剚","alias":"hotnews","type":"normal","pic_amount":0,"style":"no_pic","pics":[],"comment_amount":4,"t":"url","source":"","type_sign":"","inner_news":1,"views":4581,"comment_amount_label":"4","views_label":"4581","link":"lsapp://cn.ahurls.news/news?id=3706372","catalog_name":"绀句細"},{"id":3705671,"title":"绔犲瓙鎬￠伃绮変笣鍊掓垐鎸囪矗鍏跺弬鍔犵湡浜虹 姹嘲鍥炲簲锛氬ス搴旇闅忓績鎵\u20ac娆�","alias":"hotnews","type":"normal","pic_amount":0,"style":"no_pic","pics":[],"comment_amount":3,"t":"url","source":"","type_sign":"","inner_news":1,"views":3991,"comment_amount_label":"3","views_label":"3991","link":"lsapp://cn.ahurls.news/news?id=3705671","catalog_name":"濞变箰鎾姤"},{"id":3707529,"title":"濂芥秷鎭紒浠婂ぉ澶槼褰掓潵鍚堣偉杩炴櫞涓ゅぉ 姘旀俯椋欏埌15鈩�","alias":"hotnews","type":"normal","pic_amount":0,"style":"no_pic","pics":[],"comment_amount":3,"t":"url","source":"","type_sign":"","inner_news":1,"views":4818,"comment_amount_label":"3","views_label":"4818","link":"lsapp://cn.ahurls.news/news?id=3707529","catalog_name":"姘戠敓"},{"id":3707090,"title":"鍚堣偉甯傛暀鑲插眬瑙勫畾锛氳繘鍏ユ牎鍥殑APP涓嶅緱鍚戝鐢熸敹璐�","alias":"hotnews","type":"normal","pic_amount":0,"style":"no_pic","pics":[],"comment_amount":3,"t":"url","source":"","type_sign":"","inner_news":1,"views":4149,"comment_amount_label":"3","views_label":"4149","link":"lsapp://cn.ahurls.news/news?id=3707090","catalog_name":"姘戠敓"},{"id":3708149,"title":"鍚堣偉锛氫咯濂冲ぇ瀛︾敓鍦ㄧ綉涓婂彂甯栨眰鍖呭吇 绔熸眰鏉ヤ竴涓醇锛�","alias":"hotnews","type":"normal","pic_amount":0,"style":"no_pic","pics":[],"comment_amount":3,"t":"url","source":"","type_sign":"","inner_news":1,"views":4821,"comment_amount_label":"3","views_label":"4821","link":"lsapp://cn.ahurls.news/news?id=3708149","catalog_name":"绀句細"},{"id":3708841,"title":"濡堝寮\u20ac杞︽挒鍊掑効瀛� 鐖哥埜椤跺寘锛氱敺浜烘\u20ac昏澶氭壙鎷呰矗浠�","alias":"hotnews","type":"normal","pic_amount":0,"style":"no_pic","pics":[],"comment_amount":3,"t":"url","source":"","type_sign":"","inner_news":1,"views":4052,"comment_amount_label":"3","views_label":"4052","link":"lsapp://cn.ahurls.news/news?id=3708841","catalog_name":"鍥藉唴"},{"id":3705650,"title":"閲嶆嫵鍑哄嚮! 鍚堣偉楂樻柊鍖烘墦鍝嶅缓绛戞福鍦熷缃鍩熲\u20ac滄壂榛戦櫎鎭垛\u20ac濈涓\u20ac鏋�","alias":"hotnews","type":"normal","pic_amount":0,"style":"single_right","pics":["special/tuku/201902/201902281046405088096680_1.jpg"],"comment_amount":2,"t":"url","source":"","type_sign":"","inner_news":1,"views":4050,"comment_amount_label":"2","views_label":"4050","link":"lsapp://cn.ahurls.news/news?id=3705650","catalog_name":"鍚堣偉24灏忔椂"},{"id":3706349,"title":"2019姣呰瓒ｅ懗涓婚娲诲姩鏇寸簿褰� 涓庘\u20ac滈潚鏄ユⅵ鎯冲皬灞嬧\u20ac濆悎褰卞彲璧㈠ぇ濂�","alias":"hotnews","type":"normal","pic_amount":0,"style":"single_right","pics":["special/tuku/201801/201801171438525115976785_1.jpg"],"comment_amount":2,"t":"url","source":"","type_sign":"","inner_news":1,"views":4546,"comment_amount_label":"2","views_label":"4546","link":"lsapp://cn.ahurls.news/news?id=3706349","catalog_name":"鍚堣偉24灏忔椂"},{"id":3705652,"title":"13宀佺敺瀛╄鍕掍护鍥炲琛ュ瘨鍋囦綔涓氬悗璺虫ゼ鍧犱骸 鐢熷墠杩炲啓4灏侀仐涔�","alias":"hotnews","type":"normal","pic_amount":0,"style":"no_pic","pics":[],"comment_amount":2,"t":"url","source":"","type_sign":"","inner_news":1,"views":6544,"comment_amount_label":"2","views_label":"6544","link":"lsapp://cn.ahurls.news/news?id=3705652","catalog_name":"鍥藉唴"},{"id":3705579,"title":"鍚堣偉濂冲ぇ瀛︾敓涔樻墜鎵剁數姊鏉庤劚鎵嬬牳鏂\u20ac佷汉鑵� 鎴栧皢闈复10涓囧厓鍖昏嵂璧斿伩","alias":"hotnews","type":"normal","pic_amount":0,"style":"no_pic","pics":[],"comment_amount":2,"t":"url","source":"","type_sign":"","inner_news":1,"views":5166,"comment_amount_label":"2","views_label":"5166","link":"lsapp://cn.ahurls.news/news?id=3705579","catalog_name":"绀句細"},{"id":3707092,"title":"瀹夊窘浜轰拱鎴胯喘杞︽湰鏈堣捣閮藉皢灏戠即绋� 鍏ㄧ渷濂戠◣閫傜敤绋庣巼缁熶竴涓嬭皟鑷�3%","alias":"hotnews","type":"normal","pic_amount":0,"style":"no_pic","pics":[],"comment_amount":2,"t":"url","source":"","type_sign":"","inner_news":1,"views":5703,"comment_amount_label":"2","views_label":"5703","link":"lsapp://cn.ahurls.news/news?id=3707092","catalog_name":"瀹夊窘缁煎悎"},{"id":3709037,"title":"娓ｇ敺锛佸畨寰戒竴鐢峰瓙鍦ㄥ叕浜ょ珯鍙扮敤閾侀敜娈存墦濡诲瓙 琚緷娉曞垜鎷�","alias":"hotnews","type":"normal","pic_amount":0,"style":"no_pic","pics":[],"comment_amount":2,"t":"url","source":"","type_sign":"","inner_news":1,"views":4000,"comment_amount_label":"2","views_label":"4000","link":"lsapp://cn.ahurls.news/news?id=3709037","catalog_name":"绀句細"},{"id":3708854,"title":"QQ灏嗗疄鐜版敞閿\u20ac鍔熻兘浣欓绛変篃灏嗚娓呯┖ 浣犵殑QQ鑸嶅緱娉ㄩ攢鍚楋紵","alias":"hotnews","type":"vote","pic_amount":0,"style":"single_right","pics":[],"comment_amount":2,"t":"url","source":"","type_sign":"鎶曠エ","inner_news":1,"views":4345,"comment_amount_label":"2","views_label":"4345","link":"lsapp://cn.ahurls.news/news?id=3708854","catalog_name":"鍥藉唴"},{"id":3708842,"title":"鍚堣偉褰╂皯鍠滀腑澶т箰閫�1094涓囧ぇ濂� 鏈嬪弸鑱斿悎璐僵鎯婂枩杩炶繛","alias":"hotnews","type":"normal","pic_amount":0,"style":"no_pic","pics":[],"comment_amount":2,"t":"url","source":"","type_sign":"","inner_news":1,"views":4618,"comment_amount_label":"2","views_label":"4618","link":"lsapp://cn.ahurls.news/news?id=3708842","catalog_name":"绀句細"},{"id":3709018,"title":"閰掗┚鎶ラ椇铚滃悕瀛楄璐ㄧ枒鈥滀笉澶儚鈥� 瀹夊窘濂冲瓙锛氭垜鍘婚煩鍥芥暣瀹逛簡锛�","alias":"hotnews","type":"normal","pic_amount":0,"style":"no_pic","pics":[],"comment_amount":2,"t":"url","source":"","type_sign":"","inner_news":1,"views":3874,"comment_amount_label":"2","views_label":"3874","link":"lsapp://cn.ahurls.news/news?id=3709018","catalog_name":"绀句細"},{"id":3709496,"title":"绐佸彂锛佸悎鑲ョ懚娴峰尯鏂版捣灏氬瀹跺洯灏忓尯楂樺眰鍙戠敓鐏伨锛堝浘锛�","alias":"hotnews","type":"normal","pic_amount":0,"style":"single_right","pics":["special/tuku/201903/201903051824374463402703_1.jpg"],"comment_amount":2,"t":"url","source":"","type_sign":"","inner_news":1,"views":6742,"comment_amount_label":"2","views_label":"6742","link":"lsapp://cn.ahurls.news/news?id=3709496","catalog_name":"鍚堣偉24灏忔椂"},{"id":3710354,"title":"鍚堣偉鍏ラ\u20ac夊崄澶х編濂界敓娲诲煄甯傛鍗� 3鏈�9鏃ュ皢鍐嶆鐧讳笂澶","alias":"hotnews","type":"normal","pic_amount":0,"style":"no_pic","pics":[],"comment_amount":2,"t":"url","source":"","type_sign":"","inner_news":1,"views":4115,"comment_amount_label":"2","views_label":"4115","link":"lsapp://cn.ahurls.news/news?id=3710354","catalog_name":"姘戠敓"},{"id":3709884,"title":"10宀佹墠鐭ョ埜鐖哥壓鐗�10骞� 鎵窞灏忓鐢熶綔鏂囥\u20ac婃垜鐨勭埜鐖搞\u20ac嬭浜烘唱濂�","alias":"hotnews","type":"normal","pic_amount":0,"style":"no_pic","pics":[],"comment_amount":2,"t":"url","source":"","type_sign":"","inner_news":1,"views":8402,"comment_amount_label":"2","views_label":"8402","link":"lsapp://cn.ahurls.news/news?id=3709884","catalog_name":"鍥藉唴"},{"id":3709808,"title":"澶槼鍥炴潵浜嗭紒浠婂ぉ鍚堣偉姘旀俯鍗囧埌16鈩� 鎺ヤ笅鏉ヨ繕鏈夋儕鍠�","alias":"hotnews","type":"normal","pic_amount":0,"style":"no_pic","pics":[],"comment_amount":2,"t":"url","source":"","type_sign":"","inner_news":1,"views":4579,"comment_amount_label":"2","views_label":"4579","link":"lsapp://cn.ahurls.news/news?id=3709808","catalog_name":"姘戠敓"}]
         * extras : {"slider":[]}
         */

        private int page;
        private int perpage;
        private int max_page;
        private int total;
        private ExtrasBean extras;
        private List<DataBean> data;

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getPerpage() {
            return perpage;
        }

        public void setPerpage(int perpage) {
            this.perpage = perpage;
        }

        public int getMax_page() {
            return max_page;
        }

        public void setMax_page(int max_page) {
            this.max_page = max_page;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public ExtrasBean getExtras() {
            return extras;
        }

        public void setExtras(ExtrasBean extras) {
            this.extras = extras;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class ExtrasBean {
            private List<?> slider;

            public List<?> getSlider() {
                return slider;
            }

            public void setSlider(List<?> slider) {
                this.slider = slider;
            }
        }

        public static class DataBean {
            /**
             * id : 3706338
             * title : 浠婅捣鍚堣偉甯傛皯鎷嶈繚鍋滅瓑杩濇硶琛屼负涓炬姤鍙幏濂栧姳 闄勮缁嗘敾鐣�
             * alias : hotnews
             * type : normal
             * pic_amount : 0
             * style : single_right
             * pics : ["special/tuku/201902/201902201521242924507660.jpg"]
             * comment_amount : 4
             * t : url
             * source :
             * type_sign :
             * inner_news : 1
             * views : 6107
             * comment_amount_label : 4
             * views_label : 6107
             * link : lsapp://cn.ahurls.news/news?id=3706338
             * catalog_name : 鍚堣偉24灏忔椂
             */

            private int id;
            private String title;
            private String alias;
            private String type;
            private int pic_amount;
            private String style;
            private int comment_amount;
            private String t;
            private String source;
            private String type_sign;
            private int inner_news;
            private int views;
            private String comment_amount_label;
            private String views_label;
            private String link;
            private String catalog_name;
            private List<String> pics;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getAlias() {
                return alias;
            }

            public void setAlias(String alias) {
                this.alias = alias;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public int getPic_amount() {
                return pic_amount;
            }

            public void setPic_amount(int pic_amount) {
                this.pic_amount = pic_amount;
            }

            public String getStyle() {
                return style;
            }

            public void setStyle(String style) {
                this.style = style;
            }

            public int getComment_amount() {
                return comment_amount;
            }

            public void setComment_amount(int comment_amount) {
                this.comment_amount = comment_amount;
            }

            public String getT() {
                return t;
            }

            public void setT(String t) {
                this.t = t;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType_sign() {
                return type_sign;
            }

            public void setType_sign(String type_sign) {
                this.type_sign = type_sign;
            }

            public int getInner_news() {
                return inner_news;
            }

            public void setInner_news(int inner_news) {
                this.inner_news = inner_news;
            }

            public int getViews() {
                return views;
            }

            public void setViews(int views) {
                this.views = views;
            }

            public String getComment_amount_label() {
                return comment_amount_label;
            }

            public void setComment_amount_label(String comment_amount_label) {
                this.comment_amount_label = comment_amount_label;
            }

            public String getViews_label() {
                return views_label;
            }

            public void setViews_label(String views_label) {
                this.views_label = views_label;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getCatalog_name() {
                return catalog_name;
            }

            public void setCatalog_name(String catalog_name) {
                this.catalog_name = catalog_name;
            }

            public List<String> getPics() {
                return pics;
            }

            public void setPics(List<String> pics) {
                this.pics = pics;
            }
        }
    }
}
