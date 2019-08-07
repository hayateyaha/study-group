# Spring FrameworkとSpring Boot の違い

## 1. 結論
Spring BootはSpring Frameworkでの面倒な設定を自動的にできる。また、Spring BootはSpring Frameworkと違って、Webコンテナを内包することができる。

## 2. Spring Bootのイメージ
- あらかじめ処理の順序がきまってる(T.N.さん)
- Spring Initializr は嬉しいがようわからん(H.I.)

## 3. Spring Frameworkの歴史
- Spring 1 : XML定義の地獄
- Spring 2 : XMLなんだけど簡略化
- Spring 2.5 : component-scan嬉しいな
- Spring 3 : web周りいい感じに。
- Spring 4 : 正当進化
- Spring 5 : リアクティブサポート

## 4. Spring Bootの特徴
- 設定レス
    - 組み合わせ自動
        - Jarのバージョンも解決
    - auto-configuration
- 単品で動く
    - 組込tomcat
        - 管理機能なども自分で持つことができる

## 5. 実際にどのように自動設定(auto-configuration)されているか見る
`Application.properties`に`debug=true`を追加して、実行すると以下のように表示され、自動設定されたものと、されなかったものが分かる([参考](https://www.baeldung.com/spring-boot-auto-configuration-report))
```
.
.
.

============================
CONDITIONS EVALUATION REPORT
============================



Positive matches:
-----------------

   BatchAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'org.springframework.batch.core.launch.JobLauncher', 'javax.sql.DataSource', 'org.springframework.jdbc.co
      - @ConditionalOnBean (types: org.springframework.batch.core.launch.JobLauncher; SearchStrategy: all) found bean 'jobLauncher' (OnBeanCondition)

   BatchAutoConfiguration#batchDataSourceInitializer matched:
      - @ConditionalOnBean (types: javax.sql.DataSource; SearchStrategy: all) found bean 'dataSource'; @ConditionalOnMissingBean (types: org.springframework

.
.
.
(省略)
.
.
.

   TransactionAutoConfiguration.TransactionTemplateConfiguration matched:
      - @ConditionalOnSingleCandidate (types: org.springframework.transaction.PlatformTransactionManager; SearchStrategy: all) found a primary bean from bea

   TransactionAutoConfiguration.TransactionTemplateConfiguration#transactionTemplate matched:
      - @ConditionalOnMissingBean (types: org.springframework.transaction.support.TransactionTemplate; SearchStrategy: all) did not find any beans (OnBeanCo


Negative matches:
-----------------

   ActiveMQAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.jms.ConnectionFactory' (OnClassCondition)

   AopAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.aspectj.lang.annotation.Aspect' (OnClassCondition)

.
.
.
(省略)
.
.
.

   WebSocketServletAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.servlet.Servlet' (OnClassCondition)

   XADataSourceAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.transaction.TransactionManager' (OnClassCondition)


Exclusions:
-----------

    None


Unconditional classes:
----------------------

    org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration

    org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration

    org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration

.
.
.


```




