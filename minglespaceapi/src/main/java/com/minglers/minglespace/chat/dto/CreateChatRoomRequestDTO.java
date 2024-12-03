package com.minglers.minglespace.chat.dto;

import com.minglers.minglespace.common.entity.Image;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateChatRoomRequestDTO {
    private String name;
    private MultipartFile image;
    private Long workspaceId;
    private List<Long> participantIds;
}
