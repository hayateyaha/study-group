# EffectiveJava2-1_コンストラクタの代わりにstaticファクトリーメソッドを検討する

## 1. 結論
コンストラクタの代わりにstaticファクトリーメソッドを使用すると様々なメリットがある。
そのメリットが必要ない時はコンストラクタを使用すればよい。

## 2. staticファクトリーメソッドとは
staticファクトリーメソッドとは、下記の例のHuman#create()のようなインスタンスを返すstaticメソッドである。

```java
public class Human {
    private int age;
    private String name;

    Human(int age,String name){
        this.age=age;
        this.name=name;
    }

    public static Human create(int age,String name){
        var human=new Human(age,name);
        return human;
    }
}

```

## 3. staticファクトリーメソッドのメリット
### 1. 分かりやすいメソッド名を付けられる
### 2. オブジェクト生成のために新しいインスタンスを毎回生成する必要がない
- コンストラクタでは新しいインスタンスを生成する必要があるが、staticファクトリーメソッドでは新しいインスタンスを生成しなくてもよい。
- コンストラクタに適切なアクセス修飾子をつ受けることによって、シングルトンパターンにできる。
### 3. サブクラスのインスタンスを生成できる
### 4. 引数によって、異なるインスタンスを生成できる
- 下記の例のように引数によって異なるインスタンスを生成することができる。
```java
public static Human create(int age,String name,boolean isMan){
   Human human;
   if(isMan) human=new Man(age,name);
   else human=new Woman(age,name);
   return human;
}
```

## 4. staticファクトリーメソッドの使いどころ
- 上記のようなメリットを享受したい場合はstaticファクトリーメソッドの使用を検討する。
   - 例：Logger
- 上記のようなメリットが必要ない場合は必要ない。
   - 例：DTO