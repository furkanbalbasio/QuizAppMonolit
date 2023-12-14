package com.balbasio.QuizAppMaraton.constants;

public class RestApi {
    private static final String VERSION="/v1";
    private static final String DEV="/dev";
    private static final String TEST="/test";
    private static final String PROD="/prod";
    private static final String ROOT=VERSION+DEV;
    public static final String QUESTION= ROOT+"/question";
    public static final String ANSWER=ROOT+"/answer";
    public static final String SAVE=ROOT+"/save";
    public static final String UPDATE=ROOT+"/update";
    public static final String DELETE=ROOT+"/delete";
    public static final String FINDALL=ROOT+"/findall";
    public static final String FINDQUESTIONANDANSWERS=ROOT+"/findquestionandanswers";


}
