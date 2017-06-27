function match() {
  this.matchId = generateMatchId();
  this.members = [];
  this.admin = null;
  this.alive = this.members.length;
  this.enableRevive = false;
  this.unconciousMembers = [];
  this.dead = 0;

  //uses the array rules to determine what the rules for the match.

  this.kill = function(killer, killed) {
    killed.alive = false;
    killer.killcount++;
    this.alive -= 1;
    this.dead += 1;
  }

  this.addNewMember = function(newMember) {
    this.members.push(newMember);
    this.alive +=1;
  }

  this.getMember = function(name) {
    for(i = 0; i<this.members.length; i++) {
      if(this.members[i] == name) {
        return this.members[i];
      }
    }
    console.log("Unable to find member: " + name);
  }

  this.getMatchId = function() {
    return this.matchId;
  }

  this.print = function() {

    console.log("Match :" + this.matchId);

    if(this.members.length == 0) {
      console.log("Game is empty!");
    } else {
    for(i = 0; i<this.members.length; i++) {
      console.log(this.members[i].toString());


    }
  }
    }
  }


function generateMatchId() {
  chars = '0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ';
  result = '';
   for (var i = 10; i > 0; --i) {

   result += chars[Math.round(Math.random() * (chars.length - 1))];

  }

   return result;
}
