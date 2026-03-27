const personalData = {
    name: 'C&M太郎',
    age: 36,
    gender: '男性',
};

//オブジェクト値を出力する
console.log(personalData);

//'age'というキーの値を更新する
personalData.age = 37;

//新しくプロパティ(キーと値)を追加する
personalData.address = '東京都';

//オブジェクトの値を出力する
console.log(personalData);

//'gender'というキーの値を出力する
console.log(personalData.gender);