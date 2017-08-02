package tuanz.model.vo.base;

import tuanz.model.pc.PCAttr;
import tuanz.model.vo.tools.SkillList;

/**
 * Created by Yxm on 2017/8/2.
 */
public class Job {
    private Integer jobId;//职业ID

    private String jobName;//职业名称

    private String Desc;//职业描述

    private Integer Profession;//职业点

    private Integer[] canStudySkill;//可以学习的职业技能

    public  Job(){

    }

    public Job(Integer jobId, PCAttr pcAttr, SkillList skillList) {
        this.jobId = jobId;
        switch (this.jobId){
            //医疗系职业
            case 0:
                this.jobName = "动物辅助治疗师";
                this.Profession = pcAttr.getEdu()*10+Math.max(pcAttr.getApp(),pcAttr.getPow())*10;
                this.canStudySkill = new Integer[]{17,0,53,28,5,20,33,67};
                this.Desc = "容易亲近动物";
                break;
            case 1:
                this.jobName = "护士";
                this.Profession = pcAttr.getEdu()*20;
                this.canStudySkill = new Integer[]{3,56,0,17,16,67};
                this.Desc = "“信誉”的技能值获得+10%的加值。对患者的“劝说”获得+10%的加值";
                skillList.getAllSkill().get("信誉").setSkillValue(skillList.getAllSkill().get("信誉").getSkillValue()+10);
                break;
            case 2:
                this.jobName = "急诊医生";
                this.Profession = (pcAttr.getEdu()+pcAttr.getDex())*10;
                this.canStudySkill = new Integer[]{55,54,26,19,37,38,14,67};
                this.Desc = "看到人类和自然界动物的尸体不会丧失理智度，但是当发现死因是超自然的原因时，按通常规则丧失理智度。";
                break;
            case 3:
                this.jobName = "整形外科医生";
                this.Profession = (pcAttr.getEdu()+pcAttr.getDex())*10;
                this.canStudySkill = new Integer[]{55,54,34,0,3,4,56,67};
                this.Desc = "容貌+1";
                pcAttr.setApp(pcAttr.getApp()+1);
                break;
            case 4:
                this.jobName = "外科医生、齿科医生";
                this.Profession = (pcAttr.getEdu()+pcAttr.getDex())*10;
                this.canStudySkill = new Integer[]{55,54,34,2,28,3,56,68,67};
                this.Desc = "敏捷+1";
                pcAttr.setDex(pcAttr.getDex()+1);
                break;
            case 5:
                this.jobName = "精神科医生";
                this.Profession = Math.max(pcAttr.getEdu()*20,pcAttr.getEdu()*10+pcAttr.getApp()*10);
                this.canStudySkill = new Integer[]{55,26,0,53,28,3,56,68,69,67};
                this.Desc = "如果对一个发狂进行的“心理分析”失败，只要改善环境,喂食药物就可以再次进行“心理分析”判定。";
                break;
            case 6:
                this.jobName = "黑医生";
                this.Profession = Math.max(pcAttr.getEdu()*20,pcAttr.getEdu()*10+pcAttr.getDex()*10);
                this.canStudySkill = new Integer[]{55,54,34,3,31,56,68,67};
                this.Desc = "就算设施工具不齐全，也可用现有的道具进行充足的急救";
                break;
            //员警和消防员等
            case 7:
                this.jobName = "海警";
                this.Profession = pcAttr.getEdu()*10+Math.max(pcAttr.getStr(),pcAttr.getDex())*10;
                this.canStudySkill = new Integer[]{37,59,2,11,67};
                this.Desc = "“侦查”获得+10%修正";
                skillList.getAllSkill().get("侦查").setSkillValue(skillList.getAllSkill().get("侦查").getSkillValue()+10);
                break;
            case 8:
                this.jobName = "科学搜查研究员";
                this.Profession = (pcAttr.getEdu()+pcAttr.getDex())*10;
                this.canStudySkill = new Integer[]{55,26,39,41,24,28,31,56,67};
                this.Desc = "看到人类和自然界动物的尸体不会丧失理智度，但是当发现死因是超自然的原因时，按通常规则丧失理智度。";
                break;
            case 9:
                this.jobName = "山岳救助队员";
                this.Profession = pcAttr.getEdu()*10+Math.max(pcAttr.getStr(), pcAttr.getDex())*10;
                this.canStudySkill = new Integer[]{54,17,5,20,14,6,7,67};
                this.Desc = "只要没有恐高症，就不会对高处感到恐惧";
                break;
            case 10:
                this.jobName = "消防员";
                this.Profession = pcAttr.getEdu()*10+Math.max(pcAttr.getStr(), pcAttr.getDex())*10;
                this.canStudySkill = new Integer[]{11,54,15,37,36,5,50,14,67};
                this.Desc = "力量+1，能够不畏火焰";
                pcAttr.setStr(pcAttr.getStr()+1);
                break;
                //艺术系职业
            case 11:
                this.jobName = "艺术家（基本）";
                this.Profession = pcAttr.getEdu()*10+Math.max(pcAttr.getDex(),pcAttr.getPow())*10;
                this.canStudySkill = new Integer[]{39,41,28,27,61,62,63,64,67};
                this.Desc = "专门领域的“艺术”技能获得+10%修正";
                skillList.getAllSkill().get("art1").setSkillValue(skillList.getAllSkill().get("art1").getSkillValue()+10);
                break;
            case 12:
                this.jobName = "舞者";
                this.Profession = pcAttr.getEdu()*10+Math.max(pcAttr.getDex(),pcAttr.getPow())*10;
                this.canStudySkill = new Integer[]{67,15,22,5,14,16,61};
                this.Desc = "“艺术（舞蹈）”和“闪躲”获得+10%的修正";
                skillList.getAllSkill().get("art1").setSkillValue(skillList.getAllSkill().get("art1").getSkillValue()+10);
                skillList.getAllSkill().get("闪躲").setSkillValue(skillList.getAllSkill().get("闪躲").getSkillValue()+10);
                break;
            case 13:
                this.jobName = "设计师";
                this.Profession = Math.max(pcAttr.getEdu()*20,pcAttr.getEdu()*10+pcAttr.getPow()*10);
                this.canStudySkill = new Integer[]{67,1,3,61,62,63,64,39,0,13,16};
                this.Desc = "对流行敏感。感受性强，容易发现绘画或雕刻中暗藏的深意";
                break;
            case 14:
                this.jobName = "服饰类艺术家";
                this.Profession = pcAttr.getEdu()*10+Math.max(pcAttr.getDex(),pcAttr.getPow())*10;
                this.canStudySkill = new Integer[]{67,1,3,61,62,63,64,0,4,18,16};
                this.Desc = "对流行敏感。只要观察对方的服装，就可以知道其地位和收入等，也知道不惹人注目的首饰的价值。";
                break;
//            case 6:
//                this.jobName = "";
//                this.Profession = ;
//                this.canStudySkill = new Integer[]{67,};
//                this.Desc = "";
//                break;

        }
//        public static final String SKILLNAME[] = {
//                //59个技能
//                "心理学","话术","信誉","劝说","议价",//0-4
//                "跳跃","领航术","野外生存（山）", "野外生存（海)","野外生存（沙漠）",//5-9
//                "游泳","驾驶（汽车）","骑乘","图书馆利用", "攀爬",//10-14
//                "闪躲","侦查","聆听","乔装","开锁",//15-19
//                "跟踪","躲藏", "潜行","藏匿","人类学",//20-24
//                "神秘学","化学","天文学","生物学","地质学",//25-29
//                "自然史","法律","物理学","博物学","会计学",//30-34
//                "历史", "重机械操作","机械维修","电器维修","电脑使用",//35-39
//                "电子学","摄影", "拳击/厮打","擒抱","头槌",//40-44 40电子学 6版职业中不存在
//                "日本刀","杖","匕首", "踢击", "手枪",//45-49 48踢击不存在
//                "投掷","来复枪","散弹枪","心理分析","急救",//50-54 51来复枪不存在
//                "医学", "药剂学", "威胁","魅力",//55-58  56威胁不存在 58魅力不存在
//                //11个自定义技能
//                "drive1","drive2", //59 60 自定义驾驶
//                "crafte1","crafte2", //61 62 自定义手艺
//                "art1", "art2", //63 64 自定义艺术
//                "budo",//65 自定义武道
//                "bow",// 66 指定弓
//                "language1",//67 指定母语
//                "language2", "language3"//68 69 指定额外语言
//        };
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public Integer getProfession() {
        return Profession;
    }

    public void setProfession(Integer profession) {
        Profession = profession;
    }

    public Integer[] getCanStudySkill() {
        return canStudySkill;
    }

    public void setCanStudySkill(Integer[] canStudySkill) {
        this.canStudySkill = canStudySkill;
    }
}
