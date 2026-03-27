//output-btnというidを持つhtml要素を取得し、定数に代入する
const btn = document.getElementById('output-btn');

//html要素がクリックされたときにイベント処理を実行する
btn.addEventListener('click', () => {
    //クリックされたときの処理をここに書く
    console.log('クリックされました');
});

//add-btnというidを持つhtml要素を取得し、定数に代入する
const addBtn = document.getElementById('add-btn');

//parent-listというidを持つhtml要素を取得し、定数に代入する
const parentList = document.getElementById('parent-list')

//html要素がクリックされた時にイベント処理を実行する
addBtn.addEventListener('click', () => {
    //新しくli要素を作成する
    const childList = document.createElement('li');

    //作成したli要素にテキストを追加する
    childList.textContent = 'これはリストです';

    //作成したli要素をul要素の末尾に追加する
    parentList.appendChild(childList);
});

//count-btnというIDを持つhtml要素を取得し、定数に代入する
const countBtn = document.getElementById('count-btn');

//html要素がクリックされたときにイベント処理を実行する
countBtn.addEventListener('click', () => {

    //テキストボックスに入力された文字列を取得する
    const text = document.forms.textForm.textBox.value;

    //取得した文字列の文字数を出力する
    console.log(text.length + '文字');
});

//area-btnというidを持つhtml要素を取得し、定数に代入する
const areaBtn = document.getElementById('area-btn');

//html要素がクリックされたときにイベント処理を実行する
areaBtn.addEventListener('click', () => {

    //選択されたラジオボタンの値を取得する
    const area = document.forms.areaForm.area.value;

    //取得した値を出力する
    console.log(area);
});

//os-btnというidを持つhtml要素を取得し、定数に代入する
const osBtn = document.getElementById('os-btn');

//html要素がクリックされたときにイベント処理を実行する
osBtn.addEventListener('click', () => {

    //全てのチェックボックスを配列風のデータで取得する
    const items = document.forms.osForm.os;

    //繰り返し処理でチェックボックスを1つずつ取り出し、もし選択されていれば値を出力する
    for (let i = 0; i < items.length; i++) {
        if (items[i].checked) {
            console.log(items[i].value);
        }
    }
});