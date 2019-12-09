package com;

import javax.swing.*;
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
    private String no[]= {"ѧ��","��ʦ"};
    private String course[]= {"�γ���������,ʱ�䣺9��45���ص㣺�ٳ���ѧ�֣�4",""
            + "�γ�����java��ʱ��7��50���ص㣺�ۺ�¥0921��ѧ�֣�4",""
            + "�γ����������רҵ���ۣ�ʱ��13��30���ص㣺��0921��ѧ��2",""
            + "�γ�������ɢ��ѧ��ʱ�䣺4��00���ص㣺��101��ѧ�֣�3���ڿ���ʦ������ʦ",""
            + "�γ��������Դ�����ʱ��5��00���ص㣺��201��ѧ��4���ڿ���ʦ������ʦ",""
            + "�γ�������ѧ����ʱ��3��50���ص㣺��0925��ѧ�֣�3���ڿ���ʦ������ʦ"
    };

    SelectC(){
        jl1=new JLabel("��ѡ����Ա��Ϣ��");
        jl2=new JLabel("�ɹ�ѡ��Ŀγ̣�");
        jl3=new JLabel("ѡ��Ŀγ�Ϊ��");
        jl4=new JLabel("��ӡ�γ̵���Ϣ��");
        jbAdd=new JButton("ѡ��");
        jbRemove=new JButton("�˿�");
        jbok = new JButton("ȷ��");
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
                jta.append(jcb.getSelectedItem()+"�Ŀγ���Ϣ��\n\t");
                for(int i=0;i<dlm2.getSize()-1;i++) {
                    jta.append(dlm2.getElementAt(i)+",");
                }

                jta.append(dlm2.getElementAt(dlm2.getSize()-1)+".\n");
                jcb.removeItem(jcb.getSelectedItem());
                dlm2.clear();

            }
            else {
                JOptionPane.showMessageDialog(null,
                        "����û�����ÿγ̣�","������ʾ��",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

    }

}
