// HTMLの要素を取得する
const btn = document.getElementById('btn');
const text = document.getElementById('text');

// ボタンをクリックした時の処理を追加する
btn.addEventListener('click', () => {
    //h2要素のテキストを書き換える
    text.textContent = 'ボタンをクリックしました';
});