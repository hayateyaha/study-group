# Spring FrameworkとSpring Boot の違い
## 1. Spring Bootのイメージ
- あらかじめ処理の順序がきまってる(T.N.さん)
- Spring Initializr は嬉しいがようわからん(H.I.)

## 2. Spring Frameworkの歴史
- Spring 1 : XML定義の地獄
- Spring 2 : XMLなんだけど簡略化
- Spring 2.5 : component-scan嬉しいな
- Spring 3 : web周りいい感じに。
- Spring 4 : 正当進化
- Spring 5 : リアクティブサポート

## 3. Spring Bootの特徴
- 設定レス
    - 組み合わせ自動
        - Jarのバージョンも解決
    - auto-configure
- 単品で動く
    - 組込tomcat
        - 管理機能なども自分で持つことができる



## 4. 結論
Spring BootはSpring Frameworkでの面倒な設定を自動的にできる。また、Spring BootはSpring Frameworkと違って、Webコンテナを内包することができる。