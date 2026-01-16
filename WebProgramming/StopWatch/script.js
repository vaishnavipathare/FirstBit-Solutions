let hours = 0;
let minutes = 0;
let seconds = 0;
let timer = null;

function start() {
    if (timer !== null) {
        return; // prevents multiple intervals
    }
    timer = setInterval(runStopwatch, 1000);
}

function stop() {
    clearInterval(timer);
    timer = null;
}

function reset() {
    stop();
    hours = 0;
    minutes = 0;
    seconds = 0;
    document.getElementById("display").innerText = "00:00:00";
}

function runStopwatch() {
    seconds++;

    if (seconds === 60) {
        seconds = 0;
        minutes++;
    }

    if (minutes === 60) {
        minutes = 0;
        hours++;
    }

    let h = hours < 10 ? "0" + hours : hours;
    let m = minutes < 10 ? "0" + minutes : minutes;
    let s = seconds < 10 ? "0" + seconds : seconds;

    document.getElementById("display").innerText = `${h}:${m}:${s}`;
}
