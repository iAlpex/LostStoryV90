/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.lang.ref.WeakReference;
import client.MapleCharacter;
import handling.world.party.MapleParty;
import handling.world.party.MaplePartyCharacter;

/**
 * TODO : Make this a function for NPC instead.. cleaner
 * @author Rob
 */
public class MapleCarnivalChallenge {

    WeakReference<MapleCharacter> challenger;
    String challengeinfo = "";

    public MapleCarnivalChallenge(MapleCharacter challenger) {
        this.challenger = new WeakReference<MapleCharacter>(challenger);
        challengeinfo += "#b";
        for (MaplePartyCharacter pc : challenger.getParty().getMembers()) {
            MapleCharacter c = challenger.getMap().getCharacterById(pc.getId());
            if (c != null) {
                challengeinfo += (c.getName() + " / Level" + c.getLevel() + " / " + getJobNameById(c.getJob()));
            }
        }
        challengeinfo += "#k";
    }

    public MapleCharacter getChallenger() {
        return challenger.get();
    }

    public String getChallengeInfo() {
        return challengeinfo;
    }

    public static final String getJobNameById(int job) {
        switch (job) {
            case 0:
                return "Beginner";
            case 1000:
                return "Nobless";
            case 2000:
                return "Legend";
            case 2001:
                return "Evan";
            case 3000:
                return "Citizen";

            case 100:
                return "Warrior";// Warrior
            case 110:
                return "Fighter";
            case 111:
                return "Crusader";
            case 112:
                return "Hero";
            case 120:
                return "Page";
            case 121:
                return "White Knight";
            case 122:
                return "Paladin";
            case 130:
                return "Spearman";
            case 131:
                return "Dragon Knight";
            case 132:
                return "Dark Knight";

            case 200:
                return "Magician";
            case 210:
                return "Wizard(Fire,Poison)";
            case 211:
                return "Mage(Fire,Poison)";
            case 212:
                return "Arch Mage(Fire,Poison)";
            case 220:
                return "Wizard(Ice,Lightning)";
            case 221:
                return "Mage(Ice,Lightning)";
            case 222:
                return "Arch Mage(Ice,Lightning)";
            case 230:
                return "Cleric";
            case 231:
                return "Priest";
            case 232:
                return "Bishop";

            case 300:
                return "Archer";
            case 310:
                return "Hunter";
            case 311:
                return "Ranger";
            case 312:
                return "Bowmaster";
            case 320:
                return "Crossbow man";
            case 321:
                return "Sniper";
            case 322:
                return "Crossbow Master";

            case 400:
                return "Rogue";
            case 410:
                return "Assassin";
            case 411:
                return "Hermit";
            case 412:
                return "Night Lord";
            case 420:
                return "Bandit";
            case 421:
                return "Chief Bandit";
            case 422:
                return "Shadower";
            case 430:
                return "Blade Recruit";
            case 431:
                return "Blade Acolyte";
            case 432:
                return "Blade Specialist";
            case 433:
                return "Blade Lord";
            case 434:
                return "Blade Master";

            case 500:
                return "Pirate";
            case 510:
                return "Infighter";
            case 511:
                return "Buccaneer";
            case 512:
                return "Viper";
            case 520:
                return "Gunslinger";
            case 521:
                return "Valkyrie";
            case 522:
                return "Captain";

            case 1100:
            case 1110:
            case 1111:
            case 1112:
                return "Soul Master";

            case 1200:
            case 1210:
            case 1211:
            case 1212:
                return "Flame Wizard";

            case 1300:
            case 1310:
            case 1311:
            case 1312:
                return "Wind Breaker";

            case 1400:
            case 1410:
            case 1411:
            case 1412:
                return "Night Walker";

            case 1500:
            case 1510:
            case 1511:
            case 1512:
                return "Thunder Breaker";

            case 2100:
            case 2110:
            case 2111:
            case 2112:
                return "Aran";

            case 2200:
            case 2210:
            case 2211:
            case 2212:
            case 2213:
            case 2214:
            case 2215:
            case 2216:
            case 2217:
            case 2218:
                return "Evan";

            case 3200:
            case 3210:
            case 3211:
            case 3212:
                return "Battle Mage";

            case 3300:
            case 3310:
            case 3311:
            case 3312:
                return "Wild Hunter";

            case 3500:
            case 3510:
            case 3511:
            case 3512:
                return "Mechanic";

            default:
                return "Unknown Job";
        }
    }

    public static final String getJobBasicNameById(int job) {
        switch (job) {
            case 0:
            case 1000:
            case 2000:
            case 2001:
            case 3000:
                return "Beginner";


            case 2100:
            case 2110:
            case 2111:
            case 2112:
            case 1100:
            case 1110:
            case 1111:
            case 1112:
            case 100:
            case 110:
            case 111:
            case 112:
            case 120:
            case 121:
            case 122:
            case 130:
            case 131:
            case 132:
                return "Warrior";

            case 2200:
            case 2210:
            case 2211:
            case 2212:
            case 2213:
            case 2214:
            case 2215:
            case 2216:
            case 2217:
            case 2218:
            case 3200:
            case 3210:
            case 3211:
            case 3212:
            case 1200:
            case 1210:
            case 1211:
            case 1212:
            case 200:
            case 210:
            case 211:
            case 212:
            case 220:
            case 221:
            case 222:
            case 230:
            case 231:
            case 232:
                return "Magician";


            case 3300:
            case 3310:
            case 3311:
            case 3312:
            case 1300:
            case 1310:
            case 1311:
            case 1312:
            case 300:
            case 310:
            case 311:
            case 312:
            case 320:
            case 321:
            case 322:
                return "Bowman";

            case 1400:
            case 1410:
            case 1411:
            case 1412:
            case 400:
            case 410:
            case 411:
            case 412:
            case 420:
            case 421:
            case 422:
            case 430:
            case 431:
            case 432:
            case 433:
            case 434:
                return "Thief";

            case 3500:
            case 3510:
            case 3511:
            case 3512:
            case 1500:
            case 1510:
            case 1511:
            case 1512:
            case 500:
            case 510:
            case 511:
            case 512:
            case 520:
            case 521:
            case 522:
                return "Pirate";


            default:
                return "Unknown Job";
        }
    }
}
