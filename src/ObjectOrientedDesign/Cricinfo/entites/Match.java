package ObjectOrientedDesign.Cricinfo.entites;

import ObjectOrientedDesign.Cricinfo.enums.MatchStatus;
import ObjectOrientedDesign.Cricinfo.enums.MatchType;
import java.time.LocalDateTime;
import java.util.List;

public class Match {

    private Integer matchId;
    private List<TournamentTeam> tournamentTeams;
    private LocalDateTime startTime;
    private Venue venue;
    private Scoreboard scoreboard;
    private MatchTeam winner;
    private MatchStats matchStats;
    private MatchType matchType;
    private List<Innings> innings;
    private List<Integer> umpires;

    private List<String> commentary;
    private MatchStatus matchStatus;
    private List<MatchTeam> matchTeams;

}
