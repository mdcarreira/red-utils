package org.github.siahsang.redutils.channel;

/**
 * @author Javad Alimohammadi<bs.alimohammadi@gmail.com>
 */
public interface LockChannel {
    void subscribe(String lockName);

    /**
     * Wait for getting the notification of releasing the lock
     *
     * @param lockName
     * @param timeOutMillis
     * @return
     * @throws InterruptedException
     */
    void waitForNotification(String lockName, long timeOutMillis) throws InterruptedException;

    void unSubscribe(String lockName);
}