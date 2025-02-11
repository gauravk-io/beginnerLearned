const score = {
  win: 0,
  lose: 0,
  tie: 0,
};

function playGame(playerMove) {
  const computerMove = pickComputerMove();

  let result = '';

  if (playerMove === 'Rock') {

    if (computerMove === 'Rock') {
      result = 'Tie.';
    }
    else if (computerMove === 'Paper') {
      result = 'You Lose.';
    }
    else if (computerMove === 'Scissor') {
      result = 'You Win.';
    }

  } else if (playerMove === 'Paper') {

    if (computerMove === 'Rock') {
      result = 'You Win.';
    }
    else if (computerMove === 'Paper') {
      result = 'Tie.';
    }
    else if (computerMove === 'Scissor') {
      result = 'You Lose.';
    }

  } else if (playerMove === 'Scissor') {

    if (computerMove === 'Rock') {
      result = 'You Lose.';
    }
    else if (computerMove === 'Paper') {
      result = 'You Win.';
    }
    else if (computerMove === 'Scissor') {
      result = 'Tie.';
    }

  }

  if (result === 'You Win.') {
    score.win += 1;
  } else if (result === 'You Lose.') {
    score.lose += 1;
  } else if (result === 'Tie.') {
    score.tie += 1;
  }

  alert(`You picked ${playerMove}. Computer picked ${computerMove}. ${result}
Wins: ${score.win}, Losses: ${score.lose}, Ties: ${score.tie}`);
}

function pickComputerMove() {
  const randomNumber = (Math.random());

  let computerMove = '';

  if (randomNumber >= 0 && randomNumber < 1 / 3) {
    computerMove = 'Rock';
  }
  else if (randomNumber >= 1 / 3 && randomNumber < 2 / 3) {
    computerMove = 'Paper';
  }
  else if (randomNumber >= 2 / 3 && randomNumber < 1) {
    computerMove = 'Scissor';
  }

  return computerMove;
}