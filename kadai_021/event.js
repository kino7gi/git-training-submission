// 1. HTMLの要素を取得する
const btn = document.getElementById('btn');
const text = document.getElementById('text');

// 2. ボタンをクリックした時の処理を追加する
btn.addEventListener('click', () => {
    
    // 3. ここで「2秒待つ」タイマーを開始する
    setTimeout(() => {
        // 4. 2秒経った後に実行される処理
        text.textContent = 'ボタンをクリックしました';
        console.log('2秒経ったので文字を変えました!');
    }, 2000); // 2000ミリ秒 = 2秒

});