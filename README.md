计181杨亚星 第五次实验报告
综合性实验 
    学生选课系统设计  实验目的 分析学生选课系统 使用GUI窗体及其组件设计窗体界面 完成学生选课过程业务逻辑编程 基于文件保存并读取数据 处理异常 



实验要求 一、系统角色分析及类设计 例如：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择课程。 定义每种角色人员的属性，及其操作方法。 属性示例：	人员（编号、姓名、性别……） 教师（编号、姓名、性别、所授课程、……） 			学生（编号、姓名、性别、所选课程、……） 			课程（编号、课程名称、上课地点、时间、授课教师、……） 以上属性仅为示例，同学们可以自行扩展。  二、要求: 设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。 基于事件模型对业务逻辑编程，实现在界面上支持上述操作。 针对操作过程中可能会出现的各种异常，做异常处理 基于输入/输出编程，支持学生、课程、教师等数据的读写操作。 基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。 本次实验是综合性实验，在40%的实验成绩中占比最大，望同学们认真对待。 提交截止时间：12月8日。 








一、	流程图
                     










 核心代码   import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectC extends JFrame implements ActionListener{
  private JLabel jl1,jl2,jl3,jl4;
    private JButton jbAdd,jbRemove,jbok;
    private JList<Object> jlist1,Jlist2;
    private DefaultListModel<Object> dlm1,dlm2;
    private JComboBox<Object> jcb;
    private JTextArea jta;
    private JScrollPane jsplist1,jsplist2,jspjta;
    private String no[]= {"学生","老师"};
    private String course[]= {"课程名：体育,时间：9：45，地点：操场，学分：4",""
            + "课程名：java，时间7：50，地点：综合楼0921，学分：4",""
            + "课程名：计算机专业导论，时间13：30，地点：综0921，学分2",""
            + "课程名：离散数学，时间：4：00，地点：教101，学分：3，授课老师：王老师",""
            + "课程名：线性代数，时间5：00，地点：教201，学分4，授课老师：朴老师",""
            + "课程名：大学物理，时间3：50，地点：综0925，学分：3，授课老师：李老师"
    };

    SelectC(){
        jl1=new JLabel("请选择人员信息：");
        jl2=new JLabel("可供选择的课程：");
        jl3=new JLabel("选择的课程为：");
        jl4=new JLabel("打印课程的信息：");
        jbAdd=new JButton("选课");
        jbRemove=new JButton("退课");
        jbok = new JButton("确定");
        dlm1=new DefaultListModel<Object>();
        dlm2=new DefaultListModel<Object>();
        jlist1=new JList<Object>(dlm1);
        Jlist2=new JList<Object>(dlm2);
        jcb=new JComboBox<Object>(no);
        jta=new JTextArea(6,20);
        jsplist1=new JScrollPane(jlist1);
        jsplist2=new JScrollPane(Jlist2);
        jspjta=new JScrollPane(jta);
        jsplist1.setPreferredSize(new Dimension(550,550));
        jsplist2.setPreferredSize(new Dimension(550,550));
    }
    public void launchListComboAreaTest() {
        jta.setEditable(false);
        for(int i=0;i<course.length;i++) {
            dlm1.addElement(course[i]);
        }
        jbAdd.addActionListener(this);
        jbRemove.addActionListener(this);
        jbok.addActionListener(this);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        JPanel p[]=new JPanel[6];
        for(int i=0;i<6;i++ ) {
            p[i]=new JPanel();
            p[i].setLayout(new BoxLayout(p[i],BoxLayout.Y_AXIS));

        }
        p[0].add(jl1);
        p[0].add(jcb);
        p[1].add(jl2);
        p[1].add(jsplist1);
        p[2].add(jbAdd);
        p[2].add(jbRemove);
        p[3].add(jl3);
        p[3].add(jsplist2);
        p[4].add(jbok);
        p[5].add(jl4);
        p[5].add(jspjta);
        c.add(p[0]);
        c.add(p[1]);
        c.add(p[2]);
        c.add(p[3]);
        c.add(p[4]);
        c.add(p[5]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if(source==jbAdd) {
            @SuppressWarnings("deprecation")
            Object selectedValues[]=jlist1.getSelectedValues();
            for(int i=0;i<selectedValues.length;i++) {
                dlm2.addElement(selectedValues[i]);
                dlm1.removeElement(selectedValues[i]);
            }
        }
        if(source==jbRemove) {
            @SuppressWarnings("deprecation")
            Object selectedValues[]=Jlist2.getSelectedValues();
            for(int i=0;i<selectedValues.length;i++) {
                dlm1.addElement(selectedValues[i]);
                dlm2.removeElement(selectedValues[i]);
            }
        }
        if(source==jbok) {
            if(!dlm2.isEmpty()) {
                jta.append(jcb.getSelectedItem()+"的课程信息：\n\t");
                for(int i=0;i<dlm2.getSize()-1;i++) {
                    jta.append(dlm2.getElementAt(i)+",");
                }

                jta.append(dlm2.getElementAt(dlm2.getSize()-1)+".\n");
                jcb.removeItem(jcb.getSelectedItem());
                dlm2.clear();

            }
            else {
                JOptionPane.showMessageDialog(null,
                        "您还没有设置课程！","错误提示！",
                        JOptionPane.ERROR_MESSAGE);
            }}}}  程序截图   
https://github.com/Leonyyx1/yangyaxing/blob/master/%5BNYRHX(_%7B0HXVDQ0S%25%7BBK76.png      
编程感想       本次实验是综合性实验涉及面比较广，GUI界面设计，异常处理，又要有异常处理，学生的注册，作为没有c语言基础的初学者，只能根据教材和博客上别人的代码参考，但也终于是慢慢扣了出来，虽然还是没有完成课程的新加 本次实验对我的编程基础有了很大的提高 收获了很多 。 



