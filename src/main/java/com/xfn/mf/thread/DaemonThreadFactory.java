package com.xfn.mf.thread;

import java.util.concurrent.ThreadFactory;

/**
 * Created by po on 16/6/8.
 */
public class DaemonThreadFactory implements ThreadFactory {
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
