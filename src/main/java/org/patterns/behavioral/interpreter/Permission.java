package org.patterns.behavioral.interpreter;

//Terminal expression
public class Permission implements PermissionExpression{

    private String permission;

    public Permission(String permission) {
        this.permission = permission.toLowerCase();
    }
    @Override
    public boolean interpret(User user) {
        return user.getPermissions().contains(this.permission);
    }

    @Override
    public String toString() {
        return "Permission{" +
                "permission='" + permission + '\'' +
                '}';
    }
}
