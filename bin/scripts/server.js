function server() {
  this.activeMatches = [];
  //creates a match object and adds it to the active matches array, and returns it
  this.createMatch = function() {

    newM = new match();
    this.activeMatches.push(newM);
    return newM;

  }
  // takes a match object and removes it from active matches array
  this.endGame = function(matchName) {
    console.log("debug " + matchName);
    index = this.getMatchIndex(matchName);
    this.activeMatches.splice(index,1);

  }

  // takes a match object and returns the object from within active matches
  this.getMatch = function(matchName) {

    for(i = 0; i<this.activeMatches.length; i++) {

      if(this.activeMatches[i].getMatchId() == matchName) {

        return this.activeMatches[i];

      }

    }

  }

  // takes a match name and returns the index of the match in active matches
  this.getMatchIndex = function(matchName) {

    for(i = 0; i<this.activeMatches.length; i++) {
      console.log(this.activeMatches[i].getMatchId());
      if(this.activeMatches[i].getMatchId() == matchName) {

        return i;

      }

    }
    console.log("unable to find Match for " + matchName);
    return "Unable to find a index";

  }

  //prints the match data to the console.
  this.print = function() {

    for(i = 0; i<this.activeMatches.length; i++) {
      this.activeMatches[i].print();
    }
  }


}
