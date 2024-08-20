package com.Viorel.Book_Network.common;

import lombok.*;
import org.hibernate.mapping.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageResponse <T> {

    private List content;
    private int number;
    private int size;
    private long totalElements;
    private int totalPages;
    private boolean first;
    private boolean last;
}
