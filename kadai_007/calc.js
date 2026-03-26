//変数numに0~4までのランダムな整数を代入する
num = Math.floor(Math.random() * 15);

// 条件分岐（順番が大事！）
if (num % 3 === 0 && num % 5 === 0) {
    // 3でも5でも割り切れる（つまり15の倍数）
    console.log('3と5の倍数です');
} else if (num % 3 === 0) {
    // 3で割り切れる
    console.log('3の倍数です');
} else if (num % 5 === 0) {
    // 5で割り切れる
    console.log('5の倍数です');
} else {
    // それ以外
    console.log(num);
}
