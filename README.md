
**目前快闻客户端主要完成了界面间的交互，首页和视频两个界面的主要内容获取，新闻内容的获取，及新闻搜索。**
**客户端主界面交互主要基于Fragment，Fragment内嵌TabLayout和ViewPager，用于展示具体内容页面。**
**信息的获取采用Volley，图片的加载采用fresco，新闻的地址链接从今日头条抓取，采用GSON解析，WebView负责新闻的具体展示，目前已实现部分功能。**

**效果如下：**
**1、主页面**
***
![image](https://github.com/yuchenfw/QuickNews/blob/master/images/page_main.jpg)

**2、新闻界面**
***
![image](https://github.com/yuchenfw/QuickNews/blob/master/images/page_news.jpg)

**3、评论界面**
***
![image](https://github.com/yuchenfw/QuickNews/blob/master/images/page_comment.jpg)

**4、新闻搜索界面**
***
![image](https://github.com/yuchenfw/QuickNews/blob/master/images/page_search.jpg)

有待完善更多功能，期待您的加入！

ver1.0.1-170427
新增fresco展示图片，修复部分问题
合并分支至master