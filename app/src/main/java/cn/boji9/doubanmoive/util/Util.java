package cn.boji9.doubanmoive.util;

import android.content.Context;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import cn.boji9.doubanmoive.beans.Comment;
import cn.boji9.doubanmoive.beans.User;

/**
 * Created by wax on 2017/9/3.
 */

public class Util {
    public static int getStatusBarHeight(Context context) {
        // 获得状态栏高度
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return context.getResources().getDimensionPixelSize(resourceId);
    }

    public static Comment readCommentFromHtml(String html){
        Comment comment = new Comment();
        Document doc = Jsoup.parse(html);
        Elements elements = doc.select(".review-content.clearfix");
        String content = elements.html();
        comment.setContent(content);
        User author = new User();
        author.setName(elements.attr("data-author"));
        comment.setAuthor(author);
        return comment;
    }
}
