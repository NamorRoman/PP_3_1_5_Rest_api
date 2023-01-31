// function testWhile(a) {
//     var x = 0;
//     if (a >= 2) {
//         for (let i = 2; i <= a;  i+=2 ) {
//                 x += i;
//                 console.log(x);
//             }
//         }
//     return x;
// }

// process.stdout.write(my_function(n - 1) + " ");

//
// function Person(name, age, year) {
//     this.name = name;
//     this.age = age;
//     this.year = year;
// }
//
// var personOne = new Person("Maxime", 25, 1990);
//
// personOne.sayAll = function () {
//     for (var i in this) {
//         console.log(i + " is " + this[i]);
//     }
// }


// function testArray(a, b) {
//     var sum = 0;
//     for (let i = 0; i < a.length ; i++ ) {
//         sum += a[i];
//     }     for (let i = 0; i < b.length ; i++ ) {
//         sum += b[i];
//     } console.log(sum);
// }


var str = "http://www.stepik.org";
alert( str.search(
    /\/\// ) );


function testArray1(a, b) {
    return a.concat(b).split("").reverse().join("").concat("Иванов");
}

function testDateTime(a, b) {
    var days = ["Воскресенье", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"]
    var aDate = new Date(a);
    var bDate = new Date(b);
    var resDay = aDate > bDate ? aDate.getDay() : bDate.getDay();
    return days[resDay];
}




function testErrorFunc(a, func) {
    try {
        func(a)
    } catch (ex) {
         return  ex.name;
    }
}


