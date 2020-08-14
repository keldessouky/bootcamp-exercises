/*
 * Add Events and functions to move the Ship and Win the game
 */
// Creates the Grid -- this should only occur after the DOM loads



//to make sure this doesnt get called until everything else is fully loaded, create grid is wrapped as follows:

document.addEventListener('DOMContentLoaded', () => {

    createGrid();

    const body = document.querySelector('body');

    body.addEventListener('keyup', (event) => {

        if (event.key === 'ArrowRight') {
            moveShipRight();
        }
        if (event.key === 'ArrowLeft') {
            moveShipLeft();
        }
        if (event.key === 'ArrowUp') {
            moveShipUp();
        }
        if (event.key === 'ArrowDown') {
            moveShipDown();
        }

    });


    document.getElementById('resetButton').addEventListener('click', (event) => {

        resetGame();
        event.preventDefault();

    })

});



function isWin(nextElement) {
    if (nextElement.classList.contains('treasure')) {
        return true;
    }
    return false;
}

function win() {

    const announce = document.querySelector('.announce');
    announce.classList.add('winText');
    announce.innerText = 'ARRGGG YOU\'VE WON!!';

    getShipLocation().classList.remove('boat');

}


function moveShipRight() {
    const ship = getShipLocation();
    const right = ship.nextElementSibling;

    if (right != null && !right.classList.contains('pirate')) {

        if (isWin(right)) {

            win();
        } else {
            ship.classList.remove('boat');
            right.classList.add('boat');
        }
    }


}

function moveShipLeft() {
    const ship = getShipLocation();
    const left = ship.previousElementSibling;

    if (left != null && !left.classList.contains('pirate')) {

        ship.classList.remove('boat');
        left.classList.add('boat');

    }



}

function moveShipUp() {
    const ship = getShipLocation();
    let up = null;
    if (ship.parentElement.previousElementSibling != null) {
        const index = Array.from(ship.parentNode.children).indexOf(ship);
        up = ship.parentElement.previousElementSibling.childNodes[index];
    }
    if (up != null && !up.classList.contains('pirate')) {
        ship.classList.remove('boat');
        up.classList.add('boat');
    }

}

function moveShipDown() {

    const ship = getShipLocation();
    let down = null;
    if (ship.parentElement.nextElementSibling != null) {
        const index = Array.from(ship.parentNode.children).indexOf(ship);
        down = ship.parentElement.nextElementSibling.childNodes[index];
    }
    if (down != null && !down.classList.contains('pirate')) {

        if (isWin(down)) {
            win();
        }
        ship.classList.remove('boat');
        down.classList.add('boat');
    }

}






/**
 * Reset the Game
 */
function resetGame() {

    const ship = getShipLocation();
    if (ship != null) {
        ship.classList.remove('boat');
    }


    const announce = document.querySelector('.announce');

    if (announce.classList.contains('winText')) {
        announce.classList.remove('winText');
    }


    announce.innerText = 'Avoid the pirates!!';

    const frame = document.getElementById('frame');
    // this is another way where you pass the css selector  document.querySelector('#frame');

    frame.firstElementChild.firstElementChild.classList.add('boat');

    if (frame.lastElementChild.lastElementChild.classList.contains('pirate')) {
        frame.lastElementChild.lastElementChild.classList.remove('pirate');
    }

    frame.lastElementChild.lastElementChild.classList.add('treasure');

}


function getShipLocation() {
    return document.getElementById('frame').querySelector('.boat');

}


/**
 * Creates the game grid
 */
function createGrid() {

    // Add Code to create the game grid

    const frame = document.getElementById('frame');
    for (let i = 0; i < 10; i++) {
        buildRow(frame);
    }
    resetGame();
}

/**
 * Builds the grid rows
 * @param {element} frame 
 */
function buildRow(frame) {
    // Add code to create rows

    const row = document.createElement('div');
    row.classList.add('row');
    frame.insertAdjacentElement('beforeend', row);

    for (let i = 0; i < 10; i++) {
        buildSquare(row, i);
    }
}

/**
 * Builds the grid squares 
 * @param {element} row 
 * @param {int} count 
 */
function buildSquare(row, count) {
    // Add code to create the grid Squares

    const container = document.createElement('div');
    container.classList.add('square');

    if (container.classList.contains('pirate')) {
        container.classList.remove('pirate');
    }


    // Randomly creates pirates, but not on the first elemment
    if (count > 1) {
        if ((Math.floor(Math.random() * 100) + 1) > 85) {
            // Add the pirates here
            container.classList.add('pirate');
        }
    }
    row.insertAdjacentElement('beforeend', container);

}