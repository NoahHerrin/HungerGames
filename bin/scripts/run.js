
function main() {
  var s = new server();

    var c = s.createMatch().getMatchId();
    var d = s.createMatch().getMatchId();
    console.log(c);
    console.log(d);
  s.getMatch(c).addNewMember("Noah");
  s.getMatch(c).addNewMember("Kai");
  s.getMatch(c).addNewMember("Ben");
  s.getMatch(d).addNewMember("Garret");
  s.getMatch(d).addNewMember("Parlin");
  s.getMatch(d).addNewMember("Griffin");
  s.getMatch(d).addNewMember("Mandy");
  s.print();
  s.getMatch(d).print();
  //console.log("done");
}

// each client is its own user, admin is a user with special priviledges.

main();
