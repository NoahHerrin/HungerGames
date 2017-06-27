
function main() {
  var s = new server();
  var temp = s.createMatch().getMatchId();
  console.log(temp);
  s.createMatch();
  s.createMatch().addNewMember(new user("Noah"));

  s.print();
  s.endGame(temp);
  s.print();
}

// each client is its own user, admin is a user with special priviledges.

main();
