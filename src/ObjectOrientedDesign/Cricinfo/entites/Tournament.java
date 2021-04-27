package ObjectOrientedDesign.Cricinfo.entites;

import java.time.LocalDateTime;
import java.util.List;

public class Tournament {

    private Integer tournamentId;
    private String name;
    private TournamentStats tournamentStats;
    private List<Integer> matchList;
    private List<TournamentTeam> teamList;
    private List<Integer> venue;
    private LocalDateTime startDateTime;

}
