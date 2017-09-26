package cn.boji9.doubanmoive.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wax on 2017/9/14.
 */

public class MovieDetailBean {
    /**
     * rating : {"max":10,"average":7.5,"details":{"1":3,"3":71,"2":14,"5":48,"4":85},"stars":"40","min":0}
     * reviews_count : 11
     * videos : []
     * wish_count : 11439
     * original_title : 劇場版 ソードアート・オンライン -オーディナル・スケール
     * blooper_urls : ["http://vt3.doubanio.com/201709142209/038691428fcc55d12268f001a5af532a/view/movie/M/302200949.mp4"]
     * collect_count : 1431
     * images : {"small":"http://img7.doubanio.com/view/movie_poster_cover/ipst/public/p2498371582.webp","large":"http://img7.doubanio.com/view/movie_poster_cover/lpst/public/p2498371582.webp","medium":"http://img7.doubanio.com/view/movie_poster_cover/spst/public/p2498371582.webp"}
     * douban_site :
     * year : 2017
     * popular_comments : [{"rating":{"max":5,"value":2,"min":0},"useful_count":35,"author":{"uid":"80722428","avatar":"http://img7.doubanio.com/icon/u80722428-35.jpg","signature":"","alt":"http://www.douban.com/people/80722428/","id":"80722428","name":"焚紙樓"},"subject_id":"26634179","content":"繪柄只有電視等級，原畫只在澤城美雪出現的幾場戲才會出現與劇場版規格相應的細膩，強烈懷疑這不是巧合\u2026..","created_at":"2017-02-25 01:05:18","id":"1157001423"},{"rating":{"max":5,"value":4,"min":0},"useful_count":0,"author":{"uid":"borntokill-zh","avatar":"http://img7.doubanio.com/icon/u39132532-14.jpg","signature":"奔跑的兔子。","alt":"http://www.douban.com/people/borntokill-zh/","id":"39132532","name":"奔兔吉尔"},"subject_id":"26634179","content":"TV版过度迷恋中世纪虚拟世界，因此人物情感显得毫无底气；电影的缘故使得完成度远胜TV版，拖沓度减少，现代戏增多，激光代替血浆，血腥度降低（可能是广电会同意引进的一大原因），也试图深入探讨VR；但整体而言，仍然是套路。桐人和亚斯娜的相互拯救，并非我们熟悉的大爱，几次被拉扯到轻小说的水准。","created_at":"2017-08-31 20:57:19","id":"1175712723"},{"rating":{"max":5,"value":4,"min":0},"useful_count":23,"author":{"uid":"tildali1214","avatar":"http://img7.doubanio.com/icon/u50051173-4.jpg","signature":"Live what U Love","alt":"http://www.douban.com/people/tildali1214/","id":"50051173","name":"栗色雪"},"subject_id":"26634179","content":"日本对于AI、VR的讨论着实走在其他同行的前列，怎么以个体的力量对抗某种虚拟的霸权，怎样不让欲望侵蚀造福人类的本心，继《夏日大作战》之后又一部令人热血沸腾的虚拟世界故事。相比只是在游戏框架下卿卿我我的《微微一笑很倾城》，不能不说，段位高。","created_at":"2017-04-26 22:04:57","id":"1182843889"},{"rating":{"max":5,"value":3,"min":0},"useful_count":3,"author":{"uid":"BuddhaTree","avatar":"http://img3.doubanio.com/icon/u3867754-349.jpg","signature":"君の中に入りたい","alt":"http://www.douban.com/people/BuddhaTree/","id":"3867754","name":"Chigbhio寒山"},"subject_id":"26634179","content":"剧情略蠢，世界观还有点意思，抵制网游宣传大片，深度探讨AI ethical issue公益电影。好不容易看个电影休息一下还频繁的听见deep learning我也是要晕倒在电影院了。","created_at":"2017-04-25 01:17:30","id":"1182109950"}]
     * alt : https://movie.douban.com/subject/26634179/
     * id : 26634179
     * mobile_url : https://movie.douban.com/subject/26634179/mobile
     * photos_count : 80
     * pubdate : 2017-09-15
     * title : 刀剑神域：序列之争
     * do_count : null
     * has_video : false
     * share_url : http://m.douban.com/movie/subject/26634179
     * seasons_count : null
     * languages : ["日语"]
     * schedule_url : https://movie.douban.com/subject/26634179/cinema/
     * writers : [{"avatars":{"small":"http://img3.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"http://img7.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"http://img3.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name_en":"","name":"川原砾","alt":"https://movie.douban.com/celebrity/1381092/","id":"1381092"}]
     * pubdates : ["2017-02-18(日本)","2017-09-15(中国大陆)"]
     * website :
     * tags : ["剧场版","动漫","二次元","日本","动画","科幻","动作","A-1Pictures","人性","2017"]
     * has_schedule : true
     * durations : ["119分钟"]
     * genres : ["剧情","动画"]
     * collection : null
     * trailers : [{"medium":"http://img7.doubanio.com/img/trailer/medium/2498374052.jpg?","title":"中国预告片：终极版 (中文字幕)","subject_id":"26634179","alt":"https://movie.douban.com/trailer/221170/","small":"http://img7.doubanio.com/img/trailer/small/2498374052.jpg?","resource_url":"http://vt3.doubanio.com/201709142209/7051c2eddfe528157bb9b486b4e0c4d2/view/movie/M/302210170.mp4","id":"221170"},{"medium":"http://img3.doubanio.com/img/trailer/medium/2497109896.jpg?","title":"中国预告片：定档版 (中文字幕)","subject_id":"26634179","alt":"https://movie.douban.com/trailer/220679/","small":"http://img3.doubanio.com/img/trailer/small/2497109896.jpg?","resource_url":"http://vt3.doubanio.com/201709142209/a066a369b3d5a282592e2899e6a19d45/view/movie/M/302200679.mp4","id":"220679"},{"medium":"http://img3.doubanio.com/img/trailer/medium/2434306929.jpg?","title":"台湾预告片 (中文字幕)","subject_id":"26634179","alt":"https://movie.douban.com/trailer/212771/","small":"http://img3.doubanio.com/img/trailer/small/2434306929.jpg?","resource_url":"http://vt3.doubanio.com/201709142209/c4ff71435a5150dec813f6644a6569b8/view/movie/M/302120771.mp4","id":"212771"},{"medium":"http://img3.doubanio.com/img/trailer/medium/2408722487.jpg?","title":"台湾预告片 (中文字幕)","subject_id":"26634179","alt":"https://movie.douban.com/trailer/209688/","small":"http://img3.doubanio.com/img/trailer/small/2408722487.jpg?","resource_url":"http://vt3.doubanio.com/201709142209/22970b748fd535d092673203eb6d6346/view/movie/M/302090688.mp4","id":"209688"}]
     * episodes_count : null
     * trailer_urls : ["http://vt3.doubanio.com/201709142209/7051c2eddfe528157bb9b486b4e0c4d2/view/movie/M/302210170.mp4","http://vt3.doubanio.com/201709142209/a066a369b3d5a282592e2899e6a19d45/view/movie/M/302200679.mp4","http://vt3.doubanio.com/201709142209/c4ff71435a5150dec813f6644a6569b8/view/movie/M/302120771.mp4","http://vt3.doubanio.com/201709142209/22970b748fd535d092673203eb6d6346/view/movie/M/302090688.mp4"]
     * has_ticket : true
     * bloopers : [{"medium":"http://img7.doubanio.com/img/trailer/medium/2497776672.jpg?1504145884","title":"MV：中文主题曲《Catch the Moment》 (中文字幕)","subject_id":"26634179","alt":"https://movie.douban.com/trailer/220949/","small":"http://img7.doubanio.com/img/trailer/small/2497776672.jpg?1504145884","resource_url":"http://vt3.doubanio.com/201709142209/038691428fcc55d12268f001a5af532a/view/movie/M/302200949.mp4","id":"220949"}]
     * clip_urls : []
     * current_season : null
     * casts : [{"avatars":{"small":"http://img7.doubanio.com/img/celebrity/small/1497789604.25.jpg","large":"http://img7.doubanio.com/img/celebrity/large/1497789604.25.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/1497789604.25.jpg"},"name_en":"Yoshitsugu Matsuoka","name":"松冈祯丞","alt":"https://movie.douban.com/celebrity/1314691/","id":"1314691"},{"avatars":{"small":"http://img7.doubanio.com/img/celebrity/small/9054.jpg","large":"http://img7.doubanio.com/img/celebrity/large/9054.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/9054.jpg"},"name_en":"Haruka Tomatsu","name":"户松遥","alt":"https://movie.douban.com/celebrity/1006707/","id":"1006707"},{"avatars":{"small":"http://img3.doubanio.com/img/celebrity/small/10216.jpg","large":"http://img3.doubanio.com/img/celebrity/large/10216.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/10216.jpg"},"name_en":"Kanae Ito","name":"伊藤加奈惠","alt":"https://movie.douban.com/celebrity/1275207/","id":"1275207"},{"avatars":{"small":"http://img7.doubanio.com/img/celebrity/small/52124.jpg","large":"http://img7.doubanio.com/img/celebrity/large/52124.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/52124.jpg"},"name_en":"Ayana Taketatsu","name":"竹达彩奈","alt":"https://movie.douban.com/celebrity/1275105/","id":"1275105"}]
     * countries : ["日本"]
     * mainland_pubdate : 2017-09-15
     * photos : [{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2498983293.webp","image":"http://img7.doubanio.com/view/photo/photo/public/p2498983293.webp","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2498983293.webp","alt":"https://movie.douban.com/photos/photo/2498983293/","id":"2498983293","icon":"http://img7.doubanio.com/view/photo/icon/public/p2498983293.webp"},{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2498955910.webp","image":"http://img7.doubanio.com/view/photo/photo/public/p2498955910.webp","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2498955910.webp","alt":"https://movie.douban.com/photos/photo/2498955910/","id":"2498955910","icon":"http://img7.doubanio.com/view/photo/icon/public/p2498955910.webp"},{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2498955903.webp","image":"http://img7.doubanio.com/view/photo/photo/public/p2498955903.webp","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2498955903.webp","alt":"https://movie.douban.com/photos/photo/2498955903/","id":"2498955903","icon":"http://img7.doubanio.com/view/photo/icon/public/p2498955903.webp"},{"thumb":"http://img3.doubanio.com/view/photo/thumb/public/p2498955898.webp","image":"http://img3.doubanio.com/view/photo/photo/public/p2498955898.webp","cover":"http://img3.doubanio.com/view/photo/albumcover/public/p2498955898.webp","alt":"https://movie.douban.com/photos/photo/2498955898/","id":"2498955898","icon":"http://img3.doubanio.com/view/photo/icon/public/p2498955898.webp"},{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2498955892.webp","image":"http://img7.doubanio.com/view/photo/photo/public/p2498955892.webp","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2498955892.webp","alt":"https://movie.douban.com/photos/photo/2498955892/","id":"2498955892","icon":"http://img7.doubanio.com/view/photo/icon/public/p2498955892.webp"},{"thumb":"http://img3.doubanio.com/view/photo/thumb/public/p2498955888.webp","image":"http://img3.doubanio.com/view/photo/photo/public/p2498955888.webp","cover":"http://img3.doubanio.com/view/photo/albumcover/public/p2498955888.webp","alt":"https://movie.douban.com/photos/photo/2498955888/","id":"2498955888","icon":"http://img3.doubanio.com/view/photo/icon/public/p2498955888.webp"},{"thumb":"http://img3.doubanio.com/view/photo/thumb/public/p2498782327.webp","image":"http://img3.doubanio.com/view/photo/photo/public/p2498782327.webp","cover":"http://img3.doubanio.com/view/photo/albumcover/public/p2498782327.webp","alt":"https://movie.douban.com/photos/photo/2498782327/","id":"2498782327","icon":"http://img3.doubanio.com/view/photo/icon/public/p2498782327.webp"},{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2498782322.webp","image":"http://img7.doubanio.com/view/photo/photo/public/p2498782322.webp","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2498782322.webp","alt":"https://movie.douban.com/photos/photo/2498782322/","id":"2498782322","icon":"http://img7.doubanio.com/view/photo/icon/public/p2498782322.webp"},{"thumb":"http://img3.doubanio.com/view/photo/thumb/public/p2498782319.webp","image":"http://img3.doubanio.com/view/photo/photo/public/p2498782319.webp","cover":"http://img3.doubanio.com/view/photo/albumcover/public/p2498782319.webp","alt":"https://movie.douban.com/photos/photo/2498782319/","id":"2498782319","icon":"http://img3.doubanio.com/view/photo/icon/public/p2498782319.webp"},{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2498782314.webp","image":"http://img7.doubanio.com/view/photo/photo/public/p2498782314.webp","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2498782314.webp","alt":"https://movie.douban.com/photos/photo/2498782314/","id":"2498782314","icon":"http://img7.doubanio.com/view/photo/icon/public/p2498782314.webp"}]
     * summary : 2022年，天才编程者茅场晶彦所开发的世界最早的完全潜行专用装备设备《NERvGear》。
     这个革命性的机器给VR（假想现实）世界带来了无限的可能性。那之后经过了4年。。。。。
     《NERvGear》的后继品VR机为了对抗《AmuSphere》（第二代民用完全潜行机），发售了一个次世代的可穿戴设备《Augma》
     替换了完全潜行机能，是一个对AR（增强现实）功能进行了最大限度扩大的最先进机种。
     由于《Augma》在觉醒状态下也可以安全和便利地使用，因此一瞬间便在玩家当中传开了。
     这个杀手级内容，被叫做《Ordinal Scale序列之争（OS）》，是《Augma》专用的ARMMO RPG。
     亚斯娜和伙伴们会玩的这个游戏，桐人也准备参战了。。。。
     * clips : []
     * subtype : movie
     * directors : [{"avatars":{"small":"http://img7.doubanio.com/img/celebrity/small/1377246483.12.jpg","large":"http://img7.doubanio.com/img/celebrity/large/1377246483.12.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/1377246483.12.jpg"},"name_en":"Tomohiko Ito","name":"伊藤智彦","alt":"https://movie.douban.com/celebrity/1315992/","id":"1315992"}]
     * comments_count : 533
     * popular_reviews : [{"rating":{"max":5,"value":5,"min":0},"title":"震惊！父亲为救女儿竟设下惊天圈套，不料被网瘾少年轻松化解","subject_id":"26634179","author":{"uid":"159794570","avatar":"http://img7.doubanio.com/icon/u159794570-2.jpg","signature":"","alt":"http://www.douban.com/people/159794570/","id":"159794570","name":"有时又逝"},"summary":"像我这种读书少的人不会作诗，只会说：卧槽，好看。刚来日本留学没几天所以日语不是很好，但是并不影响观看体验。流畅的打斗，细腻的人物刻画，还有Lisa的音乐都很不错。印象最深的还是桐人他们穿越回SAO100层时...","alt":"https://movie.douban.com/review/8452201/","id":"8452201"},{"rating":{"max":5,"value":5,"min":0},"title":"情怀","subject_id":"26634179","author":{"uid":"139805658","avatar":"http://img7.doubanio.com/icon/u139805658-1.jpg","signature":"","alt":"http://www.douban.com/people/139805658/","id":"139805658","name":"仲然"},"summary":"这剧场版中桐亚给我感动的点： 1. 亚丝娜在慢慢失去记忆时写下的日记中对于桐人无限的爱意； 2. 亚丝娜在终于连桐人在sao中的面目都记不清的时候那种绝望的表情； 3. 桐人在亚丝娜晕过去的时候那种愤怒的表情； 4...","alt":"https://movie.douban.com/review/8439494/","id":"8439494"},{"rating":{"max":5,"value":4,"min":0},"title":"剧场版简评 + 半个观影指南","subject_id":"26634179","author":{"uid":"147016640","avatar":"http://img7.doubanio.com/icon/u147016640-4.jpg","signature":"","alt":"http://www.douban.com/people/147016640/","id":"147016640","name":"缺角地图"},"summary":"难得美帝这么快就引进了一部动漫电影（去年那么轰动的你的名字竟然四月份才会在美国上映），所以虽然不是SAO的铁粉，还是决定去影院看一下。        相比在日本相当不错的票房成绩，美国这边反响就显得很一般了。...","alt":"https://movie.douban.com/review/8424658/","id":"8424658"},{"rating":{"max":5,"value":4,"min":0},"title":"A-1 pictures认真全开的商业动画爽片","subject_id":"26634179","author":{"uid":"qiankunyi","avatar":"http://img7.doubanio.com/icon/u3489077-22.jpg","signature":"天気もいいし。","alt":"http://www.douban.com/people/qiankunyi/","id":"3489077","name":"钱坤一"},"summary":"本来应该是9.9的点映场，结果因为事故临时改到了9.10。但是不仅免费看了蜘蛛侠，主办方刀剑神域官微也给我们现场发放了礼物：海报文件夹、卡纸和特典小说。挺良心。 小说译者还是以前御三家字幕组的大佬。引进方...","alt":"https://movie.douban.com/review/8808025/","id":"8808025"},{"rating":{"max":5,"value":5,"min":0},"title":"人物解析","subject_id":"26634179","author":{"uid":"163475500","avatar":"http://img7.doubanio.com/icon/u163475500-2.jpg","signature":"","alt":"http://www.douban.com/people/163475500/","id":"163475500","name":"桐人君"},"summary":"桐人君很温柔，轻小说作品《刀剑神域》及其衍生作品中的男主角，真名叫桐谷和人，游戏角色名叫：桐人（キリト，Kirito），在新生ALO中有一小号，即另一ID，于GGO篇提出，名字未知。年龄14岁→16岁（桐人刚进游戏...","alt":"https://movie.douban.com/review/8650754/","id":"8650754"},{"rating":{"max":5,"value":4,"min":0},"title":"《刀剑神域：序列之争》一部将VR技术融入到动画的巅峰之作","subject_id":"26634179","author":{"uid":"165416478","avatar":"http://img3.doubanio.com/icon/user_normal.jpg","signature":"嗨，渲起来，玩转豆瓣","alt":"http://www.douban.com/people/165416478/","id":"165416478","name":"王小美"},"summary":"日本深夜档动画《刀剑神域：序列之争》是《刀剑神域》系列首部引进中国大陆的作品，该片岛国上映票房创佳绩，9月15日大陆上映能否掀起一股观影热潮？     《刀剑神域 ：序列之争》是由伊藤智彦执导，并与《刀剑神...","alt":"https://movie.douban.com/review/8811415/","id":"8811415"},{"rating":{"max":5,"value":3,"min":0},"title":"观影体验极佳","subject_id":"26634179","author":{"uid":"136228052","avatar":"http://img7.doubanio.com/icon/u136228052-5.jpg","signature":"","alt":"http://www.douban.com/people/136228052/","id":"136228052","name":"祝椒-"},"summary":"9.9号被一个朋友带去西单看点映。 作为一个专注校园和搞笑番的死肥宅，并没有看过刀剑神域，只是观影前让正在打王者荣耀的舍友胡乱的讲了一些故事内容算是恶补。 这一场电影是我观影体验最好的电影。当然，不是指...","alt":"https://movie.douban.com/review/8807685/","id":"8807685"},{"rating":{"max":5,"value":3,"min":0},"title":"略失望","subject_id":"26634179","author":{"uid":"163963759","avatar":"http://img7.doubanio.com/icon/u163963759-1.jpg","signature":"","alt":"http://www.douban.com/people/163963759/","id":"163963759","name":"坐在悬崖边望天"},"summary":"看完有些失望。刀剑作为我的入宅番，我是很喜欢刀剑的。我补了一部分小说，感觉刀剑是在讲未来网络与现实科幻作品。当我看到提出AR这个概念，我以为要讲网络和现实融合过程出现的社会问题。然而后面的剧情只是借...","alt":"https://movie.douban.com/review/8777749/","id":"8777749"},{"rating":{"max":5,"value":5,"min":0},"title":"《刀剑神域序列之争》点映简评","subject_id":"26634179","author":{"uid":"166610870","avatar":"http://img7.doubanio.com/icon/u166610870-1.jpg","signature":"","alt":"http://www.douban.com/people/166610870/","id":"166610870","name":"人类为什么要学"},"summary":"《刀剑神域：序列之争》 总的来说，电影剧情相对独立，而且在前边也花了大概一分钟剧情讲解故事背景。没看过番的话也能看得很爽。   只是会稍微差一点点看到熟悉面孔和招式和梗的惊喜感。ㄟ(▔ ,▔)ㄏ 但是依然...","alt":"https://movie.douban.com/review/8806902/","id":"8806902"},{"rating":{"max":5,"value":4,"min":0},"title":"燃烧的中二魂，带心中的迷途少年回家","subject_id":"26634179","author":{"uid":"fangyunan","avatar":"http://img3.doubanio.com/icon/u2312968-8.jpg","signature":"公众号：realmovie","alt":"http://www.douban.com/people/fangyunan/","id":"2312968","name":"方聿南"},"summary":"这个9月，一部国产巨无霸统领话题的保护月成为过去，《敦刻尔克》、《蜘蛛侠：英雄归来》、《猩球崛起3》等进口大片接力点火，把档期炒得火热，让许多影迷又尝了一回久旱逢甘露的滋味。 这个9月，对动漫粉丝群来...","alt":"https://movie.douban.com/review/8812488/","id":"8812488"}]
     * ratings_count : 1445
     * aka : ["刀剑神域：剧场版序列争战(台)","刀剑神域：序列之争 剧场版","Sword Art Online the Movie: Ordinal Scale","剧场版SAO"]
     */

    private RatingBean rating;
    private int reviews_count;
    private int wish_count;
    private String original_title;
    private int collect_count;
    private ImagesBean images;
    private String douban_site;
    private String year;
    private String alt;
    private String id;
    private String mobile_url;
    private int photos_count;
    private String pubdate;
    private String title;
    private Object do_count;
    private boolean has_video;
    private String share_url;
    private Object seasons_count;
    private String schedule_url;
    private String website;
    private boolean has_schedule;
    private Object collection;
    private Object episodes_count;
    private boolean has_ticket;
    private Object current_season;
    private String mainland_pubdate;
    private String summary;
    private String subtype;
    private int comments_count;
    private int ratings_count;
    private List<?> videos;
    private List<String> blooper_urls;
    private List<PopularCommentsBean> popular_comments;
    private List<String> languages;
    private List<WritersBean> writers;
    private List<String> pubdates;
    private List<String> tags;
    private List<String> durations;
    private List<String> genres;
    private List<TrailersBean> trailers;
    private List<String> trailer_urls;
    private List<BloopersBean> bloopers;
    private List<?> clip_urls;
    private List<CastsBean> casts;
    private List<String> countries;
    private List<PhotosBean> photos;
    private List<?> clips;
    private List<DirectorsBean> directors;
    private List<PopularReviewsBean> popular_reviews;
    private List<String> aka;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public int getReviews_count() {
        return reviews_count;
    }

    public void setReviews_count(int reviews_count) {
        this.reviews_count = reviews_count;
    }

    public int getWish_count() {
        return wish_count;
    }

    public void setWish_count(int wish_count) {
        this.wish_count = wish_count;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getDouban_site() {
        return douban_site;
    }

    public void setDouban_site(String douban_site) {
        this.douban_site = douban_site;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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

    public String getMobile_url() {
        return mobile_url;
    }

    public void setMobile_url(String mobile_url) {
        this.mobile_url = mobile_url;
    }

    public int getPhotos_count() {
        return photos_count;
    }

    public void setPhotos_count(int photos_count) {
        this.photos_count = photos_count;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getDo_count() {
        return do_count;
    }

    public void setDo_count(Object do_count) {
        this.do_count = do_count;
    }

    public boolean isHas_video() {
        return has_video;
    }

    public void setHas_video(boolean has_video) {
        this.has_video = has_video;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public Object getSeasons_count() {
        return seasons_count;
    }

    public void setSeasons_count(Object seasons_count) {
        this.seasons_count = seasons_count;
    }

    public String getSchedule_url() {
        return schedule_url;
    }

    public void setSchedule_url(String schedule_url) {
        this.schedule_url = schedule_url;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isHas_schedule() {
        return has_schedule;
    }

    public void setHas_schedule(boolean has_schedule) {
        this.has_schedule = has_schedule;
    }

    public Object getCollection() {
        return collection;
    }

    public void setCollection(Object collection) {
        this.collection = collection;
    }

    public Object getEpisodes_count() {
        return episodes_count;
    }

    public void setEpisodes_count(Object episodes_count) {
        this.episodes_count = episodes_count;
    }

    public boolean isHas_ticket() {
        return has_ticket;
    }

    public void setHas_ticket(boolean has_ticket) {
        this.has_ticket = has_ticket;
    }

    public Object getCurrent_season() {
        return current_season;
    }

    public void setCurrent_season(Object current_season) {
        this.current_season = current_season;
    }

    public String getMainland_pubdate() {
        return mainland_pubdate;
    }

    public void setMainland_pubdate(String mainland_pubdate) {
        this.mainland_pubdate = mainland_pubdate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getRatings_count() {
        return ratings_count;
    }

    public void setRatings_count(int ratings_count) {
        this.ratings_count = ratings_count;
    }

    public List<?> getVideos() {
        return videos;
    }

    public void setVideos(List<?> videos) {
        this.videos = videos;
    }

    public List<String> getBlooper_urls() {
        return blooper_urls;
    }

    public void setBlooper_urls(List<String> blooper_urls) {
        this.blooper_urls = blooper_urls;
    }

    public List<PopularCommentsBean> getPopular_comments() {
        return popular_comments;
    }

    public void setPopular_comments(List<PopularCommentsBean> popular_comments) {
        this.popular_comments = popular_comments;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<WritersBean> getWriters() {
        return writers;
    }

    public void setWriters(List<WritersBean> writers) {
        this.writers = writers;
    }

    public List<String> getPubdates() {
        return pubdates;
    }

    public void setPubdates(List<String> pubdates) {
        this.pubdates = pubdates;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getDurations() {
        return durations;
    }

    public void setDurations(List<String> durations) {
        this.durations = durations;
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

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<TrailersBean> getTrailers() {
        return trailers;
    }

    public void setTrailers(List<TrailersBean> trailers) {
        this.trailers = trailers;
    }

    public List<String> getTrailer_urls() {
        return trailer_urls;
    }

    public void setTrailer_urls(List<String> trailer_urls) {
        this.trailer_urls = trailer_urls;
    }

    public List<BloopersBean> getBloopers() {
        return bloopers;
    }

    public void setBloopers(List<BloopersBean> bloopers) {
        this.bloopers = bloopers;
    }

    public List<?> getClip_urls() {
        return clip_urls;
    }

    public void setClip_urls(List<?> clip_urls) {
        this.clip_urls = clip_urls;
    }

    public List<CastsBean> getCasts() {
        return casts;
    }

    public void setCasts(List<CastsBean> casts) {
        this.casts = casts;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<PhotosBean> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotosBean> photos) {
        this.photos = photos;
    }

    public List<?> getClips() {
        return clips;
    }

    public void setClips(List<?> clips) {
        this.clips = clips;
    }

    public List<DirectorsBean> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorsBean> directors) {
        this.directors = directors;
    }

    public List<PopularReviewsBean> getPopular_reviews() {
        return popular_reviews;
    }

    public void setPopular_reviews(List<PopularReviewsBean> popular_reviews) {
        this.popular_reviews = popular_reviews;
    }

    public List<String> getAka() {
        return aka;
    }

    public void setAka(List<String> aka) {
        this.aka = aka;
    }

    public static class RatingBean {
        /**
         * max : 10
         * average : 7.5
         * details : {"1":3,"3":71,"2":14,"5":48,"4":85}
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

        public static class DetailsBean {
            /**
             * 1 : 3
             * 3 : 71
             * 2 : 14
             * 5 : 48
             * 4 : 85
             */

            @SerializedName("1")
            private int _$1;
            @SerializedName("3")
            private int _$3;
            @SerializedName("2")
            private int _$2;
            @SerializedName("5")
            private int _$5;
            @SerializedName("4")
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

    public static class ImagesBean {
        /**
         * small : http://img7.doubanio.com/view/movie_poster_cover/ipst/public/p2498371582.webp
         * large : http://img7.doubanio.com/view/movie_poster_cover/lpst/public/p2498371582.webp
         * medium : http://img7.doubanio.com/view/movie_poster_cover/spst/public/p2498371582.webp
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

    public static class PopularCommentsBean {
        /**
         * rating : {"max":5,"value":2,"min":0}
         * useful_count : 35
         * author : {"uid":"80722428","avatar":"http://img7.doubanio.com/icon/u80722428-35.jpg","signature":"","alt":"http://www.douban.com/people/80722428/","id":"80722428","name":"焚紙樓"}
         * subject_id : 26634179
         * content : 繪柄只有電視等級，原畫只在澤城美雪出現的幾場戲才會出現與劇場版規格相應的細膩，強烈懷疑這不是巧合…..
         * created_at : 2017-02-25 01:05:18
         * id : 1157001423
         */

        private RatingBeanX rating;
        private int useful_count;
        private AuthorBean author;
        private String subject_id;
        private String content;
        private String created_at;
        private String id;

        public RatingBeanX getRating() {
            return rating;
        }

        public void setRating(RatingBeanX rating) {
            this.rating = rating;
        }

        public int getUseful_count() {
            return useful_count;
        }

        public void setUseful_count(int useful_count) {
            this.useful_count = useful_count;
        }

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class RatingBeanX {
            /**
             * max : 5
             * value : 2
             * min : 0
             */

            private int max;
            private int value;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class AuthorBean {
            /**
             * uid : 80722428
             * avatar : http://img7.doubanio.com/icon/u80722428-35.jpg
             * signature :
             * alt : http://www.douban.com/people/80722428/
             * id : 80722428
             * name : 焚紙樓
             */

            private String uid;
            private String avatar;
            private String signature;
            private String alt;
            private String id;
            private String name;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
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

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public static class WritersBean {
        /**
         * avatars : {"small":"http://img3.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"http://img7.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"http://img3.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"}
         * name_en :
         * name : 川原砾
         * alt : https://movie.douban.com/celebrity/1381092/
         * id : 1381092
         */

        private AvatarsBean avatars;
        private String name_en;
        private String name;
        private String alt;
        private String id;

        public AvatarsBean getAvatars() {
            if(avatars == null){
                avatars = new AvatarsBean();
                avatars.setSmall("");
                avatars.setMedium("");
                avatars.setLarge("");
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

        public static class AvatarsBean {
            /**
             * small : http://img3.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png
             * large : http://img7.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png
             * medium : http://img3.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png
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

    public static class TrailersBean {
        /**
         * medium : http://img7.doubanio.com/img/trailer/medium/2498374052.jpg?
         * title : 中国预告片：终极版 (中文字幕)
         * subject_id : 26634179
         * alt : https://movie.douban.com/trailer/221170/
         * small : http://img7.doubanio.com/img/trailer/small/2498374052.jpg?
         * resource_url : http://vt3.doubanio.com/201709142209/7051c2eddfe528157bb9b486b4e0c4d2/view/movie/M/302210170.mp4
         * id : 221170
         */

        private String medium;
        private String title;
        private String subject_id;
        private String alt;
        private String small;
        private String resource_url;
        private String id;

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getResource_url() {
            return resource_url;
        }

        public void setResource_url(String resource_url) {
            this.resource_url = resource_url;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class BloopersBean {
        /**
         * medium : http://img7.doubanio.com/img/trailer/medium/2497776672.jpg?1504145884
         * title : MV：中文主题曲《Catch the Moment》 (中文字幕)
         * subject_id : 26634179
         * alt : https://movie.douban.com/trailer/220949/
         * small : http://img7.doubanio.com/img/trailer/small/2497776672.jpg?1504145884
         * resource_url : http://vt3.doubanio.com/201709142209/038691428fcc55d12268f001a5af532a/view/movie/M/302200949.mp4
         * id : 220949
         */

        private String medium;
        private String title;
        private String subject_id;
        private String alt;
        private String small;
        private String resource_url;
        private String id;

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getResource_url() {
            return resource_url;
        }

        public void setResource_url(String resource_url) {
            this.resource_url = resource_url;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class CastsBean {
        /**
         * avatars : {"small":"http://img7.doubanio.com/img/celebrity/small/1497789604.25.jpg","large":"http://img7.doubanio.com/img/celebrity/large/1497789604.25.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/1497789604.25.jpg"}
         * name_en : Yoshitsugu Matsuoka
         * name : 松冈祯丞
         * alt : https://movie.douban.com/celebrity/1314691/
         * id : 1314691
         */

        private AvatarsBeanX avatars;
        private String name_en;
        private String name;
        private String alt;
        private String id;

        public AvatarsBeanX getAvatars() {
            if(avatars == null){
                avatars = new AvatarsBeanX();
                avatars.setSmall("");
                avatars.setMedium("");
                avatars.setLarge("");
            }
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

        public static class AvatarsBeanX {
            /**
             * small : http://img7.doubanio.com/img/celebrity/small/1497789604.25.jpg
             * large : http://img7.doubanio.com/img/celebrity/large/1497789604.25.jpg
             * medium : http://img7.doubanio.com/img/celebrity/medium/1497789604.25.jpg
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

    public static class PhotosBean {
        /**
         * thumb : http://img7.doubanio.com/view/photo/thumb/public/p2498983293.webp
         * image : http://img7.doubanio.com/view/photo/photo/public/p2498983293.webp
         * cover : http://img7.doubanio.com/view/photo/albumcover/public/p2498983293.webp
         * alt : https://movie.douban.com/photos/photo/2498983293/
         * id : 2498983293
         * icon : http://img7.doubanio.com/view/photo/icon/public/p2498983293.webp
         */

        private String thumb;
        private String image;
        private String cover;
        private String alt;
        private String id;
        private String icon;

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
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

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public static class DirectorsBean {
        /**
         * avatars : {"small":"http://img7.doubanio.com/img/celebrity/small/1377246483.12.jpg","large":"http://img7.doubanio.com/img/celebrity/large/1377246483.12.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/1377246483.12.jpg"}
         * name_en : Tomohiko Ito
         * name : 伊藤智彦
         * alt : https://movie.douban.com/celebrity/1315992/
         * id : 1315992
         */

        private AvatarsBeanXX avatars;
        private String name_en;
        private String name;
        private String alt;
        private String id;

        public AvatarsBeanXX getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBeanXX avatars) {
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

        public static class AvatarsBeanXX {
            /**
             * small : http://img7.doubanio.com/img/celebrity/small/1377246483.12.jpg
             * large : http://img7.doubanio.com/img/celebrity/large/1377246483.12.jpg
             * medium : http://img7.doubanio.com/img/celebrity/medium/1377246483.12.jpg
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

    public static class PopularReviewsBean {
        /**
         * rating : {"max":5,"value":5,"min":0}
         * title : 震惊！父亲为救女儿竟设下惊天圈套，不料被网瘾少年轻松化解
         * subject_id : 26634179
         * author : {"uid":"159794570","avatar":"http://img7.doubanio.com/icon/u159794570-2.jpg","signature":"","alt":"http://www.douban.com/people/159794570/","id":"159794570","name":"有时又逝"}
         * summary : 像我这种读书少的人不会作诗，只会说：卧槽，好看。刚来日本留学没几天所以日语不是很好，但是并不影响观看体验。流畅的打斗，细腻的人物刻画，还有Lisa的音乐都很不错。印象最深的还是桐人他们穿越回SAO100层时...
         * alt : https://movie.douban.com/review/8452201/
         * id : 8452201
         */

        private RatingBeanXX rating;
        private String title;
        private String subject_id;
        private AuthorBeanX author;
        private String summary;
        private String alt;
        private String id;

        public RatingBeanXX getRating() {
            return rating;
        }

        public void setRating(RatingBeanXX rating) {
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public AuthorBeanX getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBeanX author) {
            this.author = author;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
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

        public static class RatingBeanXX {
            /**
             * max : 5
             * value : 5
             * min : 0
             */

            private int max;
            private int value;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class AuthorBeanX {
            /**
             * uid : 159794570
             * avatar : http://img7.doubanio.com/icon/u159794570-2.jpg
             * signature :
             * alt : http://www.douban.com/people/159794570/
             * id : 159794570
             * name : 有时又逝
             */

            private String uid;
            private String avatar;
            private String signature;
            private String alt;
            private String id;
            private String name;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
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

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
