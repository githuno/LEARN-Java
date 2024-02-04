function message(){
    document.getElementById("view_time").innerHTML=getNow();
}

function getNow(){
    var now = new Date;
    var year = now.getFullYear;
    var mon = now.getMonth()+1;
    var day = now.getDate;
    var hour = now.getHours;
    var min = now.getMinutes;
    var sec = now.getSeconds;
    return now;
}