/**
 * 	@Author: iPoopMagic (David)
 *	@Mapto: Lounge
 */
function enter(pi) {
	var em = pi.getEventManager("OrbisPQ");
	var eim = pi.getPlayer().getEventInstance();
	var party = eim.getPlayers();
	var map = eim.getMapInstance(920010600);
	if (pi.isLeader()) {
		if (em.getProperty("stage5").equals("0")) {
			for (var i = 0; i < party.size(); i++) {
				party.get(i).dropMessage(6, "The leader has changed to map <" + map.getMapName() + ">.");
				party.get(i).changeMap(map, map.getPortal(17));
			}
			return true;
		} else {
			pi.getPlayer().dropMessage(5, "You may not go back to this room.");
			return false;
		}
	} else {
		if (party.get(0).getMapId() == 920010600) {
			pi.warp(920010600, 17);
			return true;
		} else {
			pi.getPlayer().dropMessage(5, "Only the party leader can decide to leave this room or not.");
			return false;
		}
	}
}