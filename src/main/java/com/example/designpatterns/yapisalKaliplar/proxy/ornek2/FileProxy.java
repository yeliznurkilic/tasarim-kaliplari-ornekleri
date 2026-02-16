package com.example.designpatterns.yapisalKaliplar.proxy.ornek2;

public class FileProxy implements File{
    private RealFile realFile;
    private String userRole;
    public FileProxy(String userRole, String realFile) {
        this.userRole = userRole;
        this.realFile = new RealFile(realFile);
    }
    @Override
    public void read() {
        realFile.read();
    }
    @Override
    public void write() {
        realFile.write();
    }
    @Override
    public void delete() {
        if (userRole.equals("admin")) {
            realFile.delete();
            System.out.println("Dosya admin tarafından silindi.");
        }else {
            System.out.println("Erişim engellendi! Kullanici adi admin olmalidir.");
        }
    }
}
