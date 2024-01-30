package com.example.kafkatest.kafkatest;

import lombok.*;

@Getter
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@ToString
public class DelayMessage {

	private final long messageIndex;
	private final long delay;

}
