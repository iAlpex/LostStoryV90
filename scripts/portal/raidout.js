/**
*	The old dojo mapout portal
*
*/

function enter(pi) {
	var loc = pi.getPlayer().getSavedLocation("MIRROR");
	if(loc != null)pi.warp(loc);
	else pi.warp(100000000);
	return true;
}