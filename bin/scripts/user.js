
//each user has a... name, password, color, team, kill count, alive status.
function user(setName) {
  this.name = setName;
  this.color = "not implemented yet";
  this.team = "none";
  this.killcount = 0;
  this.alive = true;

  this.toString = function() {
    return "Name " + this.name + ", Status " + this.alive + ", Kill Count " + this.killcount;
  }
}
//takes a array and a name and returns the user in the array with the matching name

function admin(setName) {

}
