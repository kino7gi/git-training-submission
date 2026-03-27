// 今この瞬間の日時情報を取得して「today」という箱に入れる
const today = new Date();

// 日本の形式（〇〇年〇月〇日）に整えて表示する
console.log(today.toLocaleDateString('ja-JP', {
    year: 'numeric',
    month: 'long',
    day: 'numeric'
}));