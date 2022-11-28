package me.jincrates.modernjavainaction.ch02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apple {

    private int weight = 0;

    private Color color;
}
