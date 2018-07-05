package com.gp.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfflineEntity {

     private String PID;
     private String SHEBAOBH;
     private String YBKH;

     @Override
     public String toString() {
          StringBuilder sb = new StringBuilder();
          sb.append(PID)
                  .append(SHEBAOBH)
                  .append(YBKH);
          return sb.toString();
     }
}
