<!DOCTYPE html>
<html dir="ltr" lang="ja">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=yes, maximum-scale=1.0, minimum-scale=1.0">
    <meta name="description" content="ヤスイ家具株式会社 | イケてる家具をお手頃な値段であなたに">
    <meta name="keywords" content="">
    <title>ヤスイ家具へようこそ | やすい家具ならヤスイ家具</title>
    <link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
    <link rel="stylesheet" href="css/login.css" type="text/css" media="screen">
    <!--[if lt IE 9]>
<script src="js/html5.js"></script>
<script src="js/css3-mediaqueries.js"></script>
<![endif]-->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="js/script.js"></script>
</head>

<body>
    <!-- ヘッダー -->
    <header id="header">
        <div class="inner">
            <!-- ロゴ -->
            <div class="logo">
                <a href="index.html">Yasui Furniture</a>
                <h1>ヤスイ家具へようこそ</h1>
            </div>
            <!-- / ロゴ -->

            <!-- メインナビゲーション -->
            <nav id="mainNav">
                <a class="menu" id="menu"><span>MENU</span></a>
                <div class="panel">
                    <ul>
                        <li id="greeting">
                            <a href="Greeting.html">
                                <p>ご挨拶</p>
                                <p class="panel-caption">Greeting</p>
                            </a>
                        </li>
                        <li id="service">
                            <a href="Service.html">
                                <p>サービス概要</p>
                                <p class="panel-caption">Service</p>
                            </a>
                        </li>
                        <li id="approach">
                            <a href="Approach.html">
                                <p>弊社の取り組み</p>
                                <p class="panel-caption">Approach</p>
                            </a>
                        </li>
                        <li id="company">
                            <a href="Company.html">
                                <p>会社情報</p>
                                <p class="panel-caption">Company</p>
                            </a>
                        </li>
                        <li id="contact">
                            <a href="Contact.html">
                                <p>問い合わせ</p>
                                <p class="panel-caption">Contact</p>
                            </a>
                        </li>
                        <li id="index" class="active">
                            <a href="index.html">
                                <p>ログイン</p>
                                <p class="panel-caption">Login</p>
                            </a>
                        </li>
                    </ul>
                </div>
            </nav>
            <!-- メインナビゲーション -->

        </div>
    </header>
    <!-- / ヘッダー -->

    <div id="wrapper">

        <!-- コンテンツ -->
        <section id="main">
            <section class="content">
                <h3 class="heading">ログイン</h3>
                <article>
                    <form method="POST" action="list.html">
                        <fieldset>
                            <legend>ユーザー名：</legend>
                            <input class="login-form" type="text" name="username" size="20" maxlength="30" value="" style="ime-mode: disabled" autofocus placeholder="ユーザー名" />
                        </fieldset>
                        <fieldset>
                            <legend>パスワード：</legend>
                            <input class="login-form" type="password" name="password" size="20" maxlength="30" value="" style="ime-mode: disabled" placeholder="パスワード" />
                        </fieldset>
                        <fieldset>
                            <input class="login-button" type="submit" name="submit" value="ログイン">
                        </fieldset>
                    </form>
                </article>
                <article>
                    <p>※オンライン会員登録は現在準備中です。会員登録は店舗にてお願い致します。</p>
                </article>
            </section>
        </section>
    </div>
    <!-- / WRAPPER -->
    <!-- フッター -->
    <footer id="footer">
        <div class="inner">

            <!-- 3カラム -->
            <section class="gridWrapper">

                <article class="grid">
                    <!-- ロゴ -->
                    <p class="logo"><a href="index.html">Yasui Furniture<br /><span>イケてる家具をお手頃な値段であなたに</span></a></p>
                    <!-- / ロゴ -->
                </article>

                <article class="grid">
                    <!-- 電話番号+受付時間 -->
                    <p class="tel">電話: <strong>012-3456-7890</strong></p>
                    <p>受付時間: 平日 AM 10:00 〜 PM 9:00</p>
                    <!-- / 電話番号+受付時間 -->
                </article>

                <article class="grid copyright">
                    Copyright(c) 2019 Yasui Furniture Inc. All Rights Reserved.
                </article>

            </section>
            <!-- / 3カラム -->

        </div>
    </footer>
    <!-- / フッター -->

</body>

</html>