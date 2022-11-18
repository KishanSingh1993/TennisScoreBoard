package com.example.tennisscoreboard;

public class Constants {

    //Constants used in building up the Game Play Text updates
    public static final String NEW_LINE = "\n";
    public static final String COMMA_SPACE = ", ";
    //Bundle Constants to persist the state on configuration change
    public static final String BUNDLE_GAME_STARTED_BOOL_KEY = "IsGameStarted";
    public static final String BUNDLE_MATCH_TYPE_MEN_BOOL_KEY = "IsMatchTypeMen";
    public static final String BUNDLE_MATCH_TYPE_WOMEN_BOOL_KEY = "IsMatchTypeWomen";
    public static final String BUNDLE_DEUCE_BOOL_KEY = "IsDeuceGame";
    public static final String BUNDLE_TIE_BREAKER_ON_BOOL_KEY = "IsTieBreaker";
    public static final String BUNDLE_PLUS_BUTTON_ENABLED_BOOL_KEY = "IsPlusButtonEnabled";
    public static final String BUNDLE_PLAYER_TO_SERVE_INT_KEY = "PlayerToServe";
    public static final String BUNDLE_PLAYER_TO_OPEN_SET_INT_KEY = "PlayerToOpenSet";
    public static final String BUNDLE_ONGOING_SET_INT_KEY = "OngoingSet";
    public static final String BUNDLE_TOTAL_SETS_TO_PLAY_INT_KEY = "TotalSetsToPlay";
    public static final String BUNDLE_TOTAL_SETS_TO_WIN_INT_KEY = "TotalSetsToWin";
    public static final String BUNDLE_PLAYER_1_SCORE_BOARD_POINTS_PREFIX_KEY = "P1ScoreBoardPointsList_";
    public static final String BUNDLE_PLAYER_1_GAMEPLAY_SCORES_PREFIX_KEY = "P1GamePlayScoresList_";
    public static final String BUNDLE_PLAYER_2_SCORE_BOARD_POINTS_PREFIX_KEY = "P2ScoreBoardPointsList_";
    public static final String BUNDLE_PLAYER_2_GAMEPLAY_SCORES_PREFIX_KEY = "P2GamePlayScoresList_";
    public static final String BUNDLE_GAMEPLAY_TEXT_KEY = "GamePlayText";
    public static final String BUNDLE_START_RESET_BUTTON_LABEL_KEY = "StartResetButtonLabel";
}
