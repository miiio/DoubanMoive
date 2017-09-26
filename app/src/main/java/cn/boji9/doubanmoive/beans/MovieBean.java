package cn.boji9.doubanmoive.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wax on 2017/9/14.
 */

public class MovieBean{
    /**
     * count : 2
     * start : 0
     * total : 49
     * subjects : [{"rating":{"max":10,"average":7.2,"details":{"1":40,"3":725,"2":124,"5":307,"4":858},"stars":"40","min":0},"genres":["剧情","动作","科幻"],"title":"猩球崛起3：终极之战","casts":[{"avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1375081883.31.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1375081883.31.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1375081883.31.jpg"},"name_en":"Andy Serkis","name":"安迪·瑟金斯","alt":"https://movie.douban.com/celebrity/1002708/","id":"1002708"},{"avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/501.jpg","large":"https://img3.doubanio.com/img/celebrity/large/501.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/501.jpg"},"name_en":"Woody Harrelson","name":"伍迪·哈里森","alt":"https://movie.douban.com/celebrity/1053560/","id":"1053560"},{"avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/7723.jpg","large":"https://img3.doubanio.com/img/celebrity/large/7723.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/7723.jpg"},"name_en":"Steve Zahn","name":"史蒂夫·茨恩","alt":"https://movie.douban.com/celebrity/1035639/","id":"1035639"}],"durations":["140分钟"],"collect_count":5465,"mainland_pubdate":"2017-09-15","has_video":false,"original_title":"War for the Planet of the Apes","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/18161.jpg","large":"https://img3.doubanio.com/img/celebrity/large/18161.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/18161.jpg"},"name_en":"Matt Reeves","name":"马特·里夫斯","alt":"https://movie.douban.com/celebrity/1045032/","id":"1045032"}],"pubdates":["2017-07-14(美国)","2017-09-15(中国大陆)"],"year":"2017","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2494093630.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2494093630.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2494093630.webp"},"alt":"https://movie.douban.com/subject/25808075/","id":"25808075"},{"rating":{"max":10,"average":7.5,"details":{"1":3,"3":71,"2":14,"5":48,"4":85},"stars":"40","min":0},"genres":["剧情","动画"],"title":"刀剑神域：序列之争","casts":[{"avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1497789604.25.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1497789604.25.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1497789604.25.jpg"},"name_en":"Yoshitsugu Matsuoka","name":"松冈祯丞","alt":"https://movie.douban.com/celebrity/1314691/","id":"1314691"},{"avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/9054.jpg","large":"https://img3.doubanio.com/img/celebrity/large/9054.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/9054.jpg"},"name_en":"Haruka Tomatsu","name":"户松遥","alt":"https://movie.douban.com/celebrity/1006707/","id":"1006707"},{"avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/10216.jpg","large":"https://img3.doubanio.com/img/celebrity/large/10216.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/10216.jpg"},"name_en":"Kanae Ito","name":"伊藤加奈惠","alt":"https://movie.douban.com/celebrity/1275207/","id":"1275207"}],"durations":["119分钟"],"collect_count":1428,"mainland_pubdate":"2017-09-15","has_video":false,"original_title":"劇場版 ソードアート・オンライン -オーディナル・スケール","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1377246483.12.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1377246483.12.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1377246483.12.jpg"},"name_en":"Tomohiko Ito","name":"伊藤智彦","alt":"https://movie.douban.com/celebrity/1315992/","id":"1315992"}],"pubdates":["2017-02-18(日本)","2017-09-15(中国大陆)"],"year":"2017","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2498371582.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2498371582.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2498371582.webp"},"alt":"https://movie.douban.com/subject/26634179/","id":"26634179"}]
     * title : 正在上映的电影-北京
     */

    private int count;
    private int start;
    private int total;
    private String title;
    private List<SubjectsBean> subjects;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubjectsBean> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectsBean> subjects) {
        this.subjects = subjects;
    }

    public static class SubjectsBean  implements Serializable  {
        /**
         * rating : {"max":10,"average":7.2,"details":{"1":40,"3":725,"2":124,"5":307,"4":858},"stars":"40","min":0}
         * genres : ["剧情","动作","科幻"]
         * title : 猩球崛起3：终极之战
         * casts : [{"avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1375081883.31.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1375081883.31.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1375081883.31.jpg"},"name_en":"Andy Serkis","name":"安迪·瑟金斯","alt":"https://movie.douban.com/celebrity/1002708/","id":"1002708"},{"avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/501.jpg","large":"https://img3.doubanio.com/img/celebrity/large/501.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/501.jpg"},"name_en":"Woody Harrelson","name":"伍迪·哈里森","alt":"https://movie.douban.com/celebrity/1053560/","id":"1053560"},{"avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/7723.jpg","large":"https://img3.doubanio.com/img/celebrity/large/7723.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/7723.jpg"},"name_en":"Steve Zahn","name":"史蒂夫·茨恩","alt":"https://movie.douban.com/celebrity/1035639/","id":"1035639"}]
         * durations : ["140分钟"]
         * collect_count : 5465
         * mainland_pubdate : 2017-09-15
         * has_video : false
         * original_title : War for the Planet of the Apes
         * subtype : movie
         * directors : [{"avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/18161.jpg","large":"https://img3.doubanio.com/img/celebrity/large/18161.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/18161.jpg"},"name_en":"Matt Reeves","name":"马特·里夫斯","alt":"https://movie.douban.com/celebrity/1045032/","id":"1045032"}]
         * pubdates : ["2017-07-14(美国)","2017-09-15(中国大陆)"]
         * year : 2017
         * images : {"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2494093630.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2494093630.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2494093630.webp"}
         * alt : https://movie.douban.com/subject/25808075/
         * id : 25808075
         */

        private RatingBean rating;
        private String title;
        private int collect_count;
        private String mainland_pubdate;
        private boolean has_video;
        private String original_title;
        private String subtype;
        private String year;
        private ImagesBean images;
        private String alt;
        private String id;
        private List<String> genres;
        private List<CastsBean> casts;
        private List<String> durations;
        private List<DirectorsBean> directors;
        private List<String> pubdates;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getCollect_count() {
            return collect_count;
        }

        public void setCollect_count(int collect_count) {
            this.collect_count = collect_count;
        }

        public String getMainland_pubdate() {
            return mainland_pubdate;
        }

        public void setMainland_pubdate(String mainland_pubdate) {
            this.mainland_pubdate = mainland_pubdate;
        }

        public boolean isHas_video() {
            return has_video;
        }

        public void setHas_video(boolean has_video) {
            this.has_video = has_video;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<String> getGenres() {
            return genres;
        }

        public String getDirectorStr(){
            String str = "";
            for(int i  =0;i<directors.size();i++){
                if(i==0){
                    str += directors.get(i).getName();
                }else{
                    str += "/" + directors.get(i).getName();
                }
            }
            return str;
        }

        public String getGenresStr(){
            String str = "";
            for(int i  =0;i<genres.size();i++){
                if(i==0){
                    str += genres.get(i);
                }else{
                    str += "/" + genres.get(i);
                }
            }
            return str;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public String getCastsStr(){
            String str = "";
            for(int i  =0;i<casts.size();i++){
                if(i==0){
                    str += casts.get(i).getName();
                }else{
                    str += "/" + casts.get(i).getName();
                }
            }
            return str;
        }

        public List<CastsBean> getCasts() {
            if(casts == null){
                casts = new ArrayList<>();
            }
            return casts;
        }

        public void setCasts(List<CastsBean> casts) {
            this.casts = casts;
        }

        public List<String> getDurations() {
            return durations;
        }

        public void setDurations(List<String> durations) {
            this.durations = durations;
        }

        public List<DirectorsBean> getDirectors() {
            return directors;
        }

        public void setDirectors(List<DirectorsBean> directors) {
            this.directors = directors;
        }

        public List<String> getPubdates() {
            return pubdates;
        }

        public void setPubdates(List<String> pubdates) {
            this.pubdates = pubdates;
        }

        public static class RatingBean  implements Serializable   {
            /**
             * max : 10
             * average : 7.2
             * details : {"1":40,"3":725,"2":124,"5":307,"4":858}
             * stars : 40
             * min : 0
             */

            private int max;
            private double average;
            private DetailsBean details;
            private String stars;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public double getAverage() {
                return average;
            }

            public void setAverage(double average) {
                this.average = average;
            }

            public DetailsBean getDetails() {
                return details;
            }

            public void setDetails(DetailsBean details) {
                this.details = details;
            }

            public String getStars() {
                return stars;
            }

            public void setStars(String stars) {
                this.stars = stars;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }

            public static class DetailsBean   implements Serializable  {
                /**
                 * 1 : 40
                 * 3 : 725
                 * 2 : 124
                 * 5 : 307
                 * 4 : 858
                 */

                @com.google.gson.annotations.SerializedName("1")
                private int _$1;
                @com.google.gson.annotations.SerializedName("3")
                private int _$3;
                @com.google.gson.annotations.SerializedName("2")
                private int _$2;
                @com.google.gson.annotations.SerializedName("5")
                private int _$5;
                @com.google.gson.annotations.SerializedName("4")
                private int _$4;

                public int get_$1() {
                    return _$1;
                }

                public void set_$1(int _$1) {
                    this._$1 = _$1;
                }

                public int get_$3() {
                    return _$3;
                }

                public void set_$3(int _$3) {
                    this._$3 = _$3;
                }

                public int get_$2() {
                    return _$2;
                }

                public void set_$2(int _$2) {
                    this._$2 = _$2;
                }

                public int get_$5() {
                    return _$5;
                }

                public void set_$5(int _$5) {
                    this._$5 = _$5;
                }

                public int get_$4() {
                    return _$4;
                }

                public void set_$4(int _$4) {
                    this._$4 = _$4;
                }
            }
        }

        public static class ImagesBean   implements Serializable   {
            /**
             * small : https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2494093630.webp
             * large : https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2494093630.webp
             * medium : https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2494093630.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class CastsBean  implements Serializable   {
            /**
             * avatars : {"small":"https://img3.doubanio.com/img/celebrity/small/1375081883.31.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1375081883.31.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1375081883.31.jpg"}
             * name_en : Andy Serkis
             * name : 安迪·瑟金斯
             * alt : https://movie.douban.com/celebrity/1002708/
             * id : 1002708
             */

            private AvatarsBean avatars;
            private String name_en;
            private String name;
            private String alt;
            private String id;

            public AvatarsBean getAvatars() {
                if(avatars.getLarge()==null&&avatars.getMedium()==null&&avatars.getSmall()==null){
                    avatars.setLarge("");
                    avatars.setMedium("");
                    avatars.setSmall("");
                }
                return avatars;
            }

            public void setAvatars(AvatarsBean avatars) {
                this.avatars = avatars;
            }

            public String getName_en() {
                return name_en;
            }

            public void setName_en(String name_en) {
                this.name_en = name_en;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class AvatarsBean   implements Serializable   {
                /**
                 * small : https://img3.doubanio.com/img/celebrity/small/1375081883.31.jpg
                 * large : https://img3.doubanio.com/img/celebrity/large/1375081883.31.jpg
                 * medium : https://img3.doubanio.com/img/celebrity/medium/1375081883.31.jpg
                 */

                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }

        public static class DirectorsBean   implements Serializable   {
            /**
             * avatars : {"small":"https://img3.doubanio.com/img/celebrity/small/18161.jpg","large":"https://img3.doubanio.com/img/celebrity/large/18161.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/18161.jpg"}
             * name_en : Matt Reeves
             * name : 马特·里夫斯
             * alt : https://movie.douban.com/celebrity/1045032/
             * id : 1045032
             */

            private AvatarsBeanX avatars;
            private String name_en;
            private String name;
            private String alt;
            private String id;

            public AvatarsBeanX getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsBeanX avatars) {
                this.avatars = avatars;
            }

            public String getName_en() {
                return name_en;
            }

            public void setName_en(String name_en) {
                this.name_en = name_en;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class AvatarsBeanX   implements Serializable   {
                /**
                 * small : https://img3.doubanio.com/img/celebrity/small/18161.jpg
                 * large : https://img3.doubanio.com/img/celebrity/large/18161.jpg
                 * medium : https://img3.doubanio.com/img/celebrity/medium/18161.jpg
                 */

                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }
    }
}
