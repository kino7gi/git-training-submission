//back-btnというidを持つhtml要素を取得し、定数に代入する
const backBtn = document.getElementById('back-btn');

//画面がスクロールされたときにイベント処理を実行する
window.addEventListener('scroll', () => {
    //画面の空くrーる量をpx数で取得する
    const scrollValue = document.scrollingElement.scrollTop;

    //画面のスクロール量が300px以上であれば、「TOPに戻る」ボタンを表示する
    if (scrollValue >= 300) {
        backBtn.style.display = 'inline';
    } 
    //画面のスクロール量が300px未満であれば、「TOPに戻る」ボタンを非表示にする
    else {
        backBtn.style.display = 'none';
    }
});
