package org.patterns.behavioral.visitor;

public class PrintVisitor implements Visitor{

    @Override
    public void visit(Programmer programmer) {
        String msg = programmer.getName() + " is a" + programmer.getSkill() + " programmer.";
        System.out.println(msg);
    }

    @Override
    public void visit(ProjectLead projectLead) {
        String msg = projectLead.getName() + " is a project Lead with " + projectLead.getDirectReports().size() + " programmers reporting.";
        System.out.println(msg);
    }

    @Override
    public void visit(Manager manager) {
        String msg = manager.getName() + " is a Manager with " + manager.getDirectReports().size() + " leaders reporting.";
        System.out.println(msg);
    }

    @Override
    public void visit(VicePresident vicePresident) {
        String msg = vicePresident.getName() + " is a Vice President with " + vicePresident.getDirectReports().size() + " managers reporting.";
        System.out.println(msg);
    }
}
