/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsmanagement_refactoring_guru.observer.example;

/**
 *
 * @author FA22-BSE-027
 */
import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}