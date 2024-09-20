# [首页查询更多项目](https://github.com/GraduationProject-weixin) 包安装运行


# 50446wxapp高校宿舍信息管理系统小程序

![picture](https://raw.githubusercontent.com/GraduationProject-springboot/.github/main/img/wx.png)

### 点击播放视频 ▼
[![Watch the video](https://i.sstatic.net/Vp2cE.png)](https://www.bilibili.com/video/BV1NvtMeFEiw?p=106)


# 绪论
## 1.1 研究背景
现在大家正处于互联网加的时代，这个时代它就是一个信息内容无比丰富，信息处理与管理变得越加高效的网络化的时代，这个时代让大家的生活不仅变得更加地便利化，也让时间变得更加地宝贵化，因为每天的每分钟，每秒钟这些时间都能让人们处理大批量的日常事务，这些场景，是之前的手工模式无法与之相抗衡的。对于公寓信息的管理来说，传统的通过纸质文档记录信息的方式已经落后了，依靠手工管理公寓信息，不仅花费较长的工作时间，在对记录各种信息的文档进行信息查询以及信息核对操作时，也不能及时保证信息的准确性，基于这样的办公低效率环境下，对于公寓信息的处理就要提出新的解决方案。因为这个时代的信息一直都在高速发展，要是不抱着发展的观念看待事情，极有可能被这个市场快速遗忘，甚至被无情地淘汰掉。所以尽早开发一款高校宿舍信息管理系统小程序进行信息的快速处理，既跟上了时代的发展脚步，也能让自己的核心竞争力有所提升。
## 1.2目的和意义
互联网加的时代一方面是加快信息的发展，另一方面也是对传统行业进行筛选，能够继续发展的，肯定是那些能够充分运用互联网技术进行自身升级改革的行业。那些停步不前的行业只能就此结束，进而被大家所遗忘。这次设计出来的高校宿舍信息管理系统小程序，它不仅能够让管理人员在信息增加，信息的编辑等事务处理上，节省很多的时间，也会砍掉一部分的人工成本，节省不必要开支的资金。另外，此系统的操作界面是可视化的界面，管理人员无需付费培训就能尽快上手。高校宿舍信息管理系统小程序的开发意义如下：

1、管理人员再也不用在查询信息上花费大量宝贵的时间了，通过信息关键词字段就可以在几秒内获取需要的信息，在各种突发事件面前管理人员也不用慌张，可以从容淡定地处理各种相关信息。

2、该系统在每天的24小时期间都是不会停止服务的，只要有信息操作的需要，管理人员都能使用常用的360浏览器，或者百度浏览器，或者谷歌浏览器，2345浏览器等大众浏览器都能登录系统，然后操作对应的功能。

3、有了这款信息管理类操作软件，所有需要进行处理的数据不用在纸质版本的文档上进行记载，而是基于电脑进行信息录入。

4、公寓方面的信息都是通过网站进行显示，其实质是这些信息都保存在网站对应的数据库里面。只要操作员不去恶意删除信息，那么这些信息将会永久保存。
## 1.3 论文结构安排
编写高校宿舍信息管理系统小程序相对应的论文，其实就是对开发完成的程序进行再次解读的过程。本论文从七个方面的内容讲解了开发的程序，具体内容如下：

第一个部分：就是论文的绪论，这个部分就是介绍在什么样的背景下开发的程序，以及这个程序开发出来具有什么意义等内容。

第二个部分：就是介绍开发这个程序使用了什么技术，使用什么数据库保存程序的数据信息，程序开发的语言是使用的什么语言等内容。

第三个部分：就是介绍这个程序开发在现实生活的可行性问题，也讲述了程序开发需要设置什么功能等内容。

第四个部分：就是已经知晓程序的大致功能，需要对程序的功能进行更为严格的细分，也需要出具相应的功能结构图，同时，也要设计程序对应的数据库，包括数据库里面的数据表的设计等内容。

第五个部分：就是在系统的编码阶段，需要使用编程语言完成程序的功能，完成程序的界面设计，最终以界面实现的效果图展示设计成果等内容。

第六个部分：就是程序已经完成了开发的前提之下，需要检测程序的各个模块是否衔接正常，程序各个功能能否在网络等一切外部条件正常的情况下运行，这期间要是出现任何错误都需要及时记录并在后期进行修补完善。

第七个部分：就是论文最后的总结部分，描述遇到的问题，采用的解决思路等内容。
# 2 相关技术
## 2.1 VUE介绍  
Vue (读音 /vjuː/，类似于 view) 是一套用于构建用户界面的渐进式框架。与其它大型框架不同的是，Vue 被设计为可以自底向上逐层应用。Vue 的核心库只关注视图层，不仅易于上手，还便于与第三方库或既有项目整合。另一方面，当与[现代化的工具链](https://v2.cn.vuejs.org/v2/guide/single-file-components.html)以及各种[支持类库](https://github.com/vuejs/awesome-vue#libraries--plugins)结合使用时，Vue 也完全能够为复杂的单页应用提供驱动。
## 2.2 Mysql数据库介绍
有了程序功能的操作，也需要对程序操作的各个功能所产生的数据信息存放在一个固定的仓库里面，这个所谓的仓库就是大家最熟悉的程序开发需要使用的数据库了，数据库能够发展到至今的模样，其实也是经历了很多的变化历程的，在最开始由于数据信息处理的需要开始推出最低级的数据管理，这个阶段也是数据库早期的人工管理的阶段，后来也经历了文件管理的阶段，这个阶段的数据管理因为信息不能够进行共享，加上管理的数据对配套的程序产生了较强的依赖性，在数据信息管理上也存在很多数据的重复记载造成数据冗余等问题。所以为了解决上述一系列文件管理阶段所产生的数据管理的问题，对数据管理方式进行了全方位的升级改造，也就让数据管理进入了一个全新的阶段——数据库系统的阶段。这个阶段也是数据库管理数据的一个全新的相当高级的阶段。

说到数据库，也不得不说数据库的模型，数据库拥有的数据模型有网状，还有层次，以及关系型这三样数据库模型。网状的结构就是把记录的每条信息都比喻成一个点，点跟点之间也有联系，最终就形成了一个像网一样的结构，就是所谓的网状数据模型。也有对数据记录使用树状结构的方式进行数据保存，这个就是层次数据模型，关系数据库模型运用在现在市面上常见的数据库当中了，像本系统开发使用的MySQL数据库，还有安装过程比较复杂的Sqlserver数据库，也有一些比较小巧的关系型数据库，像Access数据库，FoxPro数据库等数据库。这样的关系型数据库将数据表里面的行还有列进行相互关联形成一个二维矩阵的方式来保存程序所产生的数据信息。

本次之所以选择MySQL数据库来当程序数据存放的仓库，则是因为此数据库安装不用费时，也不需要各种百度信息去解决安装过程中出现的任何问题，而且由于自己的电脑内存比较小，才4个G，为了更好的开发项目程序，针对低配置的电脑选择MySQL数据库也是情理之中。图2.3展示了数据列设计中需要使用的列类型。

![](/md/blog.001.png)

` `图2.3数据列类型图
## 2.3 JAVA语言介绍
在1995年这一年的5月份，著名的Sun Microsystems公司在程序开发设计上面郑重推出一种面向对象开发的程序设计语言——Java，最开始的时候Java是由詹姆斯.高斯林这位伟大的JAVA之父来进行主导，但是在后来由于各种原因，让甲骨文公司这个针对商业程序创建了oracle大型数据库的公司收购了Java。Java的平台总共算下来有3个，分别为javaME和javaSE以及javaEE这3个java平台。下面将对其进行分别介绍。

1.在电脑桌面程序的开发上面需要选择JavaME，这个用得也比较多。

2.企业也会根据工作以及业务需要开发各种软件，那么就会选用JavcEE这个支持企业版软件的开发的Java平台，JavcEE主攻运用在企业领域上面的web应用，JavcEE也在javaSE的基础上获得了比如jsp技术 ，Servlet技术等程序开发技术的支持。

3.现在生活中手机的普及化，也使得手机端这样的移动设备的软件的兴起，JavaME这个迷你版java平台就能运用于移动端的软件开发操作。图2.4就是 Java技术原理图。

![](/md/blog.002.png)

图2.4 Java技术原理图


# 3 系统分析
## 3.1系统可行性分析
需要使用大部分精力开发的高校宿舍信息管理系统小程序为了充分降低开发风险，特意在开发之前进行可行性分析这个验证系统开发是否可行的步骤。本文就会从技术角度，经济角度，还有用户使用的程序的运行角度进行综合阐述。
### 3.1.1 技术可行性分析
开发程序选择的是面向对象的，功能强大的，简单易用的Java程序设计语言，数据库的开发工具使用到了Mysql数据库，由于自己之前接触过一些简单的程序开发方面的设计作品，所以对Myeclipse工具的使用比较熟练，对于数据库的操作技巧也有一定的积累。另外，程序开发需要在自己电脑上安装的软件并不多，在win7操作系统的大环境下，能够完全搭建好程序开发的操作环境，比如Myeclipse工具，Mysql数据库工具，游览器，以及处理程序图片的Photoshop工具等都能安装在自己的电脑上。总的说来，开发这个程序在技术上是可以实现的。
### 3.1.2 经济可行性分析
开发出来的程序并不是朝着商业程序的方向进行设计开发的，它只是作为一个毕业设计项目进行开发，主要用于检验学生在学校所学知识的一个检验，也锻炼学生运用网络，图书等工具进行自学的能力。所以开发这个程序软件并不会涉及到经济上面的开销，在开发软件的选择上也不会额外付费安装软件，在开发软件的官网上面就可以下载需要的软件，并根据提示的安装步骤安装软件到自己的电脑上面。总的说来，开发这个程序在经济上也不存在经费支出。
### 3.1.3 运行可行性分析
因为这个程序软件从开始开发到开发截止都是根据用户的需求进行定制，考虑到此程序软件是面向广大普通操作用户，鉴于他们的知识文化水平，特意开发出一个可操作性强的，能够很容易让使用用户上手的，具有可视化操作界面的一个程序软件。总的说来，这个程序站在用户运行程序的角度上分析，是不存在操作难的问题的。用户只要打开程序就可以免去专人培训进行程序功能操作。

经过上面从技术的角度，从经济的角度，从程序运行的角度这三个角度分析现打算开发的程序，可以得出该程序软件是可以进行开发操作的。
## 3.2系统性能分析
### 3.2.1 系统安全性
程序在使用中是不允许其他访问者随意窃取程序里面的隐秘信息，也不允许其他操作者越权操作其他管理用户操作的功能，要真正杜绝这些现象就必须在程序开发之前把程序的安全性给考虑进去。

比如现在很多程序都会把用户注册的功能给考虑进去，让用户在注册页面功能区填写自己的个人信息，这些数据信息涵盖了用户本人的姓名，用户对程序登录设置的密码，用户经常使用的邮箱，用户的常用联系方式还有用户的所住地址等信息，这些信息都是设计到用户本人的隐私，那么这些信息在传输给程序后台时，是需要进行管理并保存至对应的数据库文件里面。要是有人恶意窃取程序的数据信息，也就会让那些注册了此程序软件的用户的个人隐秘信息都会遭到泄露。这些信息落入其他不法分子手里，他们极有可能根据用户的隐私信息去骚扰用户，并把这些信息用于各种商业用途谋取其他非法的利益。所以数据安全性是一个系统能不能使用的首要标准。
### 3.2.2 数据完整性
数据完整性是确保数据信息是否具有可靠性，是否具有参考价值的一个重要因素，数据信息只描述一部分，或者必有的数据信息反而为空等现象都是代表着这个数据信息不完整，有数据缺陷，这是个很严肃的问题，因为这样的数据信息跟垃圾信息没什么两样。

说到数据完整性，不得不提最常用的程序表单功能。这些表单主要就是提取广大用户的数据信息的，需要广大用户根据表单上的要求，填写自己的姓名信息，以及自己的联系方式信息，有些也会有额外的信息填写要求，有必须要填的选项，也有不需要必填的选项。假如广大用户为了保护自己的隐私，或者不想受到其他人的骚扰，不填写必填项等信息，广大用户在最后提交此表单的时候，往往都是提交不了的。

数据完整性不仅仅限于登记的数据要完整，它也需要程序里面的所有数据信息之间存在关联，而且这种联系也是要求不能出差错的。

由于数据表之间也会存在一定的联系，所以同一个数据也会出现在另一个表格里面，那么这两个表格记录的同一个数据应该是一样的。不能够是同样的数据信息在不同表中不一样。
### 3.2.3系统可扩展性
一切事物都是一直在发展，程序员开发软件也需要带着发展的思维去进行软件开发操作，这样的话，开发出来的程序在应对管理所需时，也会相对应的进行程序升级与更新。不论是功能完善还是数据库升级都能在原来的基础上对原有程序进行迭代升级。让开发出来的程序能够走得越来越远。这也是广大用户对程序软件的使用要求。
## 3.3系统流程分析
管理员假如要操作系统提供的功能，那么管理员就要在系统的登录界面，填写管理员登录的账号信息，填写相应的密码信息，管理员需要保证这两者能够验证身份的账号以及密码信息的正确性，这样管理员就可以通过登录界面进入系统后台操作界面。图3.1就是开发的程序软件高校宿舍信息管理系统小程序它的操作流程图。

![](/md/blog.003.png)

图3.1 系统操作流程图
### 3.3.1系统登录流程
高校宿舍信息管理系统小程序的登录流程，针对的角色就是操作员的操作角色。在登录界面需要的必填信息就是账号信息，配上登录的密码信息就能登录高校宿舍信息管理系统小程序，需要注意的就是必填的账号信息和登录密码信息，都需要进行验证，系统会判断账号还有填写的密码信息的正确性，只有这两者信息都正确了，就能成功登录高校宿舍信息管理系统小程序了。系统登录流程图如下图。

![](/md/blog.004.png)

图3.2　系统登录流程图
### 3.3.2信息添加流程
用户在添加信息的界面填写的任何数据信息也是需要验证的，系统会判断用户填写信息的格式还有数据信息是不是合法信息，如果用户填写的信息是合法内容，系统就会在数据库对应的数据表里面添加信息。添加信息流程如下图。

![](/md/blog.005.png)

图3.3 添加信息流程图
### 3.3.3信息删除流程
对于那些已经失效的信息，需要用户及时进行删除，这样有利于腾出空间存放其他信息。删除信息也是先从数据库对应数据表里面删除数据，接着就是更新数据表的信息。这样删除的数据，在用户操作界面就查看不到了。信息删除流程如下图所示。

![](/md/blog.006.png)

图3.4 信息删除流程图
## 3.4系统功能分析
高校宿舍信息管理系统小程序具有管理员角色，用户角色，这几个操作权限。

高校宿舍信息管理系统小程序针对管理员设置的功能有：添加并管理各种类型信息，管理用户账户信息，管理公寓信息，管理缴费信息等内容。

高校宿舍信息管理系统小程序针对用户设置的功能有：查看并修改个人信息，查看公寓信息，查看缴费信息等内容。
# 4 系统设计
## 4.1系统概要设计
高校宿舍信息管理系统小程序并没有使用C/S结构，而是基于网络浏览器的方式去访问服务器，进而获取需要的数据信息，这种依靠浏览器进行数据访问的模式就是现在用得比较广泛的适用于广域网并且没有网速限制要求的小程序结构，图4.1就是开发出来的程序工作原理图。

![](/md/blog.007.png)

图4.1 程序工作的原理图
## 4.2系统功能结构设计
高校宿舍信息管理系统小程序针对管理员设置的功能有：添加并管理各种类型信息，管理用户账户信息，管理公寓信息，管理缴费信息等内容。

高校宿舍信息管理系统小程序针对用户设置的功能有：查看并修改个人信息，查看公寓信息，查看缴费信息等内容。
## 4.3数据库设计
### 4.3.1数据库E-R图设计
程序设计是离不开对应数据库的设计操作的，这样的做法就是减少数据对程序的依赖性，所以数据库的设计也是需要花费大量的日常时间来进行设计的，在设计中对程序开发需要存储的数据信息进行实体划分，先确认实体，然后设计实体的属性等操作，这种设计就是数据库设计里面不能少的必须有的E-R模型设计。为了降低程序设计的对应的数据库设计难度，开发人员也可以使用相应的工具来进行E-R模型设计，现在市面上设计E-R模型的工具有PowerDesigner建模工具，Navicat制作工具，还有微软的Visio绘图工具。为了简便起见，本程序在设计E-R模型的时候，就选用了微软的Visio这款功能强大，操作便利的绘图工具。

（1）下图是公寓退宿申请实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\公寓退宿申请.jpg](/md/blog.008.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\公寓退宿申请.jpg")
公寓退宿申请实体属性图

（2）下图是考试记录表实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\考试记录表.jpg](/md/blog.009.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\考试记录表.jpg")
考试记录表实体属性图

（3）下图是答题详情表实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\答题详情表.jpg](/md/blog.010.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\答题详情表.jpg")
答题详情表实体属性图

（4）下图是报修实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\报修.jpg](/md/blog.011.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\报修.jpg")
报修实体属性图

（5）下图是公寓学生实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\公寓学生.jpg](/md/blog.012.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\公寓学生.jpg")
公寓学生实体属性图

（6）下图是公寓收藏实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\公寓收藏.jpg](/md/blog.013.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\公寓收藏.jpg")
公寓收藏实体属性图

（7）下图是留言实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\留言.jpg](/md/blog.014.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\留言.jpg")
留言实体属性图

（8）下图是试卷选题实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\试卷选题.jpg](/md/blog.015.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\试卷选题.jpg")
试卷选题实体属性图

（9）下图是缴费实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\缴费.jpg](/md/blog.016.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\缴费.jpg")
缴费实体属性图

（10）下图是错题表实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\错题表.jpg](/md/blog.017.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\错题表.jpg")
错题表实体属性图

（11）下图是调宿申请实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\调宿申请.jpg](/md/blog.018.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\调宿申请.jpg")
调宿申请实体属性图

（12）下图是公寓实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\公寓.jpg](/md/blog.019.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\公寓.jpg")
公寓实体属性图

（13）下图是访客实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\访客.jpg](/md/blog.020.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\访客.jpg")
访客实体属性图

（14）下图是学生实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\学生.jpg](/md/blog.021.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\学生.jpg")
学生实体属性图

（15）下图是试卷实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\试卷.jpg](/md/blog.022.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\试卷.jpg")
试卷实体属性图

（16）下图是公寓入住申请实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\公寓入住申请.jpg](/md/blog.023.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\公寓入住申请.jpg")
公寓入住申请实体属性图

（17）下图是试题表实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\试题表.jpg](/md/blog.024.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\试题表.jpg")
试题表实体属性图

（18）下图是宿舍管理员实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\宿舍管理员.jpg](/md/blog.025.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\宿舍管理员.jpg")
宿舍管理员实体属性图

（19）下图是卫生实体和其具备的属性。

![C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\卫生.jpg](/md/blog.026.jpeg "C:/Users/Administrator/Desktop/temp111\2.1\\_\_\_\_img\卫生.jpg")
卫生实体属性图


### 4.3.2 数据库表结构设计
本次程序开发选用的数据库管理工具是Mysql数据管理工具，使用它存放数据也需要创建程序对应的数据库文件，并命名刚创建的数据库文件，有了数据库也需要创建各种数据表来充实数据库，在数据表的创建中，不仅需要对数据表命名，也需要对数据表的字段进行设计，包括每个数据表里面需要设置的字段名称，字段对应的数据类型信息，字段的主键设置这个也是不可缺少的，因为每个数据表里面的主键就是标记着这个数据表跟其他数据表相区分的唯一标志。就相当于生活中的每个人都有姓名，但是上网搜索自己的名字，会发现全国上下有很多人的名字跟自己的名字一模一样，包括姓氏以及名字，区分每个人的唯一信息就是每个人的身份证号信息，主键在数据表里面也是起着这样的重要作用。下面就介绍本次开发的程序高校宿舍信息管理系统小程序的数据表结构信息。

表4.1报修表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|yonghu\_id|Integer|学生|是|
|3|baoxiu\_uuid\_number|String|报修编号|是|
|4|baoxiu\_name|String|报修标题|是|
|5|baoxiu\_file|String|附件|是|
|6|baoxiu\_types|Integer|报修类型|是|
|7|baoxiu\_content|String|报修内容|是|
|8|insert\_time|Date|报修时间|是|
|9|baoxiu\_zhuangtai\_types|Integer|报修状态|是|
|10|baoxiu\_huifu\_content|String|回复内容|是|
|11|update\_time|Date|回复时间|是|
|12|create\_time|Date|创建时间|是|
表4.2字典表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|dic\_code|String|字段|是|
|3|dic\_name|String|字段名|是|
|4|code\_index|Integer|编码|是|
|5|index\_name|String|编码名字|是|
|6|super\_id|Integer|父字段id|是|
|7|beizhu|String|备注|是|
|8|create\_time|Date|创建时间|是|
表4.3试卷表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|exampaper\_name|String|试卷名称|是|
|3|exampaper\_date|Integer|考试时长(分钟)|是|
|4|exampaper\_myscore|Integer|试卷总分数|是|
|5|exampaper\_types|Integer|试卷状态|是|
|6|zujuan\_types|Integer|组卷方式|是|
|7|exampaper\_delete|Integer|逻辑删除（1代表未删除 2代表已删除）|是|
|8|create\_time|Date|创建时间|是|
表4.4试卷选题表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|exampaper\_id|Integer|试卷|是|
|3|examquestion\_id|Integer|试题|是|
|4|exampapertopic\_number|Integer|试题分数|是|
|5|create\_time|Date|创建时间|是|
表4.5试题表表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|examquestion\_name|String|试题名称|是|
|3|examquestion\_options|String|选项，json字符串|是|
|4|examquestion\_answer|String|正确答案|是|
|5|examquestion\_analysis|String|答案解析|是|
|6|examquestion\_types|Integer|试题类型|是|
|7|examquestion\_sequence|Integer|试题排序，值越大排越前面|是|
|8|create\_time|Date|创建时间|是|
表4.6考试记录表表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|examrecord\_uuid\_number|String|考试编号|是|
|3|yonghu\_id|Integer|考试用户|是|
|4|exampaper\_id|Integer|所属试卷id（外键）|是|
|5|total\_score|Integer|所得总分|是|
|6|insert\_time|Date|考试时间|是|
|7|create\_time|Date|创建时间|是|
表4.7答题详情表表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|examredetails\_uuid\_number|String|试卷编号|是|
|3|yonghu\_id|Integer|用户id|是|
|4|examquestion\_id|Integer|试题id（外键）|是|
|5|examredetails\_myanswer|String|考生答案|是|
|6|examredetails\_myscore|Integer|试题得分|是|
|7|create\_time|Date|创建时间|是|
表4.8错题表表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|yonghu\_id|Integer|用户id|是|
|3|exampaper\_id|Integer|试卷（外键）|是|
|4|examquestion\_id|Integer|试题id（外键）|是|
|5|examredetails\_myanswer|String|考生作答|是|
|6|insert\_time|Date|记录时间|是|
|7|create\_time|Date|创建时间|是|
表4.9访客表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|fangwu\_id|Integer|公寓|是|
|3|yonghu\_id|Integer|学生|是|
|4|fangke\_name|String|访客姓名|是|
|5|fangke\_phone|String|访客手机号|是|
|6|fangke\_id\_number|String|访客身份证号|是|
|7|sex\_types|Integer|性别|是|
|8|fangke\_content|String|来访事由|是|
|9|insert\_time|Date|来访时间|是|
|10|likai\_time|Date|离开时间|是|
|11|create\_time|Date|创建时间|是|
表4.10公寓表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|susheguanliyuan\_id|Integer|宿舍管理员|是|
|3|fangwu\_name|String|房屋名称|是|
|4|fangwu\_uuid\_number|String|公寓编号|是|
|5|fangwu\_photo|String|公寓照片|是|
|6|fangwu\_address|String|房屋位置|是|
|7|fangwu\_types|Integer|公寓类型|是|
|8|fangwu\_new\_money|BigDecimal|房租/月|是|
|9|sex\_types|Integer|性别|是|
|10|fangwu\_renshu|Integer|限制人数|是|
|11|fangwu\_yizhurenshu|Integer|已住人数|是|
|12|fangwu\_content|String|公寓介绍|是|
|13|shangxia\_types|Integer|是否上架|是|
|14|fangwu\_delete|Integer|逻辑删除|是|
|15|insert\_time|Date|录入时间|是|
|16|create\_time|Date|创建时间|是|
表4.11公寓收藏表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|fangwu\_id|Integer|公寓|是|
|3|yonghu\_id|Integer|学生|是|
|4|fangwu\_collection\_types|Integer|类型|是|
|5|insert\_time|Date|收藏时间|是|
|6|create\_time|Date|创建时间|是|
表4.12公寓学生表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|fangwu\_id|Integer|公寓|是|
|3|yonghu\_id|Integer|学生|是|
|4|insert\_time|Date|入住时间|是|
|5|create\_time|Date|创建时间|是|
表4.13公寓退宿申请表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|fangwu\_tuisu\_uuid\_number|String|退宿编号|是|
|3|fangwu\_id|Integer|公寓|是|
|4|yonghu\_id|Integer|学生|是|
|5|fangwu\_tuisu\_text|String|申请理由|是|
|6|insert\_time|Date|申请退宿时间|是|
|7|fangwu\_tuisu\_yesno\_types|Integer|申请状态|是|
|8|fangwu\_tuisu\_yesno\_text|String|审核回复|是|
|9|fangwu\_tuisu\_shenhe\_time|Date|审核时间|是|
|10|create\_time|Date|创建时间|是|
表4.14公寓入住申请表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|fangwu\_yuyue\_uuid\_number|String|报名编号|是|
|3|fangwu\_id|Integer|公寓|是|
|4|yonghu\_id|Integer|学生|是|
|5|fangwu\_yuyue\_text|String|申请理由|是|
|6|insert\_time|Date|申请入住时间|是|
|7|fangwu\_yuyue\_yesno\_types|Integer|申请状态|是|
|8|fangwu\_yuyue\_yesno\_text|String|审核回复|是|
|9|fangwu\_yuyue\_shenhe\_time|Date|审核时间|是|
|10|create\_time|Date|创建时间|是|
表4.15缴费表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|yonghu\_id|Integer|学生|是|
|3|susheguanliyuan\_id|Integer|宿舍管理员|是|
|4|jiaofei\_uuid\_number|String|缴费编号|是|
|5|jiaofei\_name|String|缴费标题|是|
|6|jiaofei\_photo|String|缴费附件|是|
|7|jiaofei\_money|BigDecimal|缴费金额|是|
|8|jiaofei\_content|String|缴费缘由|是|
|9|insert\_time|Date|通知时间|是|
|10|jiaofei\_types|Integer|缴费状态|是|
|11|create\_time|Date|创建时间|是|
表4.16留言表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|yonghu\_id|Integer|学生|是|
|3|liuyan\_uuid\_number|String|留言编号|是|
|4|liuyan\_name|String|留言标题|是|
|5|liuyan\_file|String|附件|是|
|6|liuyan\_types|Integer|留言类型|是|
|7|liuyan\_content|String|留言内容|是|
|8|insert\_time|Date|留言时间|是|
|9|liuyan\_huifu\_content|String|回复内容|是|
|10|update\_time|Date|回复时间|是|
|11|create\_time|Date|创建时间|是|
表4.17宿舍管理员表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|susheguanliyuan\_uuid\_number|String|工号|是|
|3|susheguanliyuan\_name|String|宿舍管理员姓名|是|
|4|susheguanliyuan\_phone|String|宿舍管理员手机号|是|
|5|susheguanliyuan\_id\_number|String|宿舍管理员身份证号|是|
|6|susheguanliyuan\_photo|String|宿舍管理员头像|是|
|7|susheguanliyuan\_email|String|宿舍管理员邮箱|是|
|8|jinyong\_types|Integer|账户状态|是|
|9|create\_time|Date|创建时间|是|
表4.18调宿申请表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|yonghu\_id|Integer|学生|是|
|3|fangwu\_id|Integer|公寓|是|
|4|tiaosushenqing\_uuid\_number|String|调宿申请编号|是|
|5|tiaosushenqing\_name|String|申请标题|是|
|6|tiaosushenqing\_file|String|申请附件|是|
|7|tiaosushenqing\_types|Integer|调宿申请类型|是|
|8|tiaosushenqing\_yuan\_name|String|原宿舍名称|是|
|9|tiaosushenqing\_yuan\_address|String|原宿舍位置|是|
|10|tiaosushenqing\_content|String|申请缘由|是|
|11|insert\_time|Date|申请时间|是|
|12|tiaosushenqing\_yesno\_types|Integer|申请状态|是|
|13|tiaosushenqing\_yesno\_text|String|审核意见|是|
|14|tiaosushenqing\_shenhe\_time|Date|审核时间|是|
|15|create\_time|Date|创建时间|是|
表4.19卫生表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|susheguanliyuan\_id|Integer|宿舍管理员|是|
|3|fangwu\_id|Integer|公寓|是|
|4|weisheng\_uuid\_number|String|卫生编号|是|
|5|weisheng\_photo|String|卫生照片|是|
|6|weisheng\_types|Integer|卫生状况|是|
|7|weisheng\_price|Integer|得分|是|
|8|weisheng\_content|String|卫生备注|是|
|9|insert\_time|Date|所属日期|是|
|10|create\_time|Date|创建时间|是|
表4.20学生表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|yonghu\_uuid\_number|String|学号|是|
|3|yonghu\_name|String|学生姓名|是|
|4|yonghu\_phone|String|学生手机号|是|
|5|yonghu\_id\_number|String|学生身份证号|是|
|6|yonghu\_photo|String|学生头像|是|
|7|yonghu\_xingge|String|性格|是|
|8|yonghu\_rushuishijian|String|入睡时间|是|
|9|yonghu\_qichuangshijian|String|起床时间|是|
|10|yonghu\_email|String|学生邮箱|是|
|11|new\_money|BigDecimal|余额|是|
|12|xueyuan\_types|Integer|学院|是|
|13|zhuanye\_types|Integer|专业|是|
|14|jinyong\_types|Integer|账户状态|是|
|15|create\_time|Date|创建时间|是|
表4.21管理员表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|Id|Int|id|否|
|2|username|String|员工名|是|
|3|password|String|密码|是|
|4|role|String|角色|是|
|5|addtime|Date|新增时间|是|

# 5 系统实现
## 5.1管理员功能介绍
### 5.1.1管理员登录
系统登录功能是程序必不可少的功能，在登录页面必填的数据有两项，一项就是账号，另一项数据就是密码，当管理员正确填写并提交这二者数据之后，管理员就可以进入系统后台功能操作区。下图就是管理员登录页面。

![](/md/blog.027.png)

图5.1 管理员登录页面
### 5.1.2 公寓管理
项目管理页面提供的功能操作有：查看公寓，删除公寓操作，新增公寓操作，修改公寓操作。下图就是公寓管理页面。

![](/md/blog.028.png)

图5.2  公寓管理页面
### 5.1.3 缴费信息管理
缴费信息管理页面提供的功能操作有：新增缴费，修改缴费，删除缴费操作。下图就是缴费信息管理页面。

![](/md/blog.029.png)

图5.3 缴费信息管理页面
### 5.1.4卫生管理
卫生管理页面显示所有卫生，在此页面既可以让管理员添加新的缴费信息类型，也能对已有的卫生信息执行编辑更新，失效的卫生信息也能让管理员快速删除。下图就是卫生管理页面。

![](/md/blog.030.png)

图5.4 卫生列表页面


### 5.1.5 报修管理
如图5.5显示的就是报修管理页面，此页面提供给管理员的功能有：新增报修,修改报修,删除报修。

![](/md/blog.031.png)

图5.5报修管理页面
### 5.1.6 报修类型管理
如图5.6显示的就是报修类型管理页面，此页面提供给管理员的功能有：新增报修类型,修改报修类型,删除报修类型。

![](/md/blog.032.png)

图5.6 报修类型管理页面


# 系统










