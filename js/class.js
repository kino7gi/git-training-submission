//クラスを定義する
class Product {

    //インスタンス化すると同時に処理を実行(初期化)
    constructor(name, price, category) {
        //console.log('敏感肌にも優しい100%由来のシャンプーです');
        
        //インスタンス(オブジェクト)にプロパティを持たせる
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //クラスの中にメソッドを定義する
    discribe() {
        console.log('この商品は' + this.name + 'です');
    }
}

//インスタンス化する
const shampoo = new Product('シャンプー', 1200, 'ヘアケア用品');
const coffee = new Product('コーヒー', 500, '飲み物');

//インスタンス(オブジェクト)の値を出力する
console.log(shampoo);
console.log(coffee);

//クラスの中に定義したメソッドを呼び出す
shampoo.discribe();

//通常のオブジェクトにメゾットを定義する
const user = {
    name: 'C&M太郎',
    age: 36,
    gender: '男性',
    greet: () => {
        console.log('よろしくお願いします！');
    }
}

//メゾットを呼び出す
user.greet();