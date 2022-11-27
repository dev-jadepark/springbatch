package io.springbatch.springbatchlecture.config;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class HelloJobConfiguration {    //Job을 정의


//    private final JobBuilderFactory jobBuilderFactory;
//    private final StepBuilderFactory stepBuilderFactory;
//
//    // Job 생성
//    @Bean
//    public Job helloJob() {
//        return jobBuilderFactory.get("helloJob")    //job의 이름 설정
//                .start(helloStep1()) //job은 반드시 1개이상의 step을 가진다
//                .next(helloStep2()) //그다음 step
//                .build();
//    }
//
//    // Step 생성
//    @Bean
//    public Step helloStep1() {
//        return stepBuilderFactory.get("helloStep1")  //step의 이름 설정
//                .tasklet(new Tasklet() {    //익명클래스 선언  (기본적으로 무한반복)
//                     @Override
//                     public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
//                         System.out.println("==========================");
//                         System.out.println(" >> Hello Spring Batch!!");
//                         System.out.println("==========================");
//
//                         return RepeatStatus.FINISHED;
//
//                         /*
//                         반복을 계속할 것인지를 설정
//                         null : 1번 == RepeatStatus.FINISHED
//                         */
//                     }
//                })
//                .build();
//    }
//
//    // Step 생성
//    // Step 생성
//    @Bean
//    public Step helloStep2() {
//        return stepBuilderFactory.get("helloStep2")  //step의 이름 설정
//                .tasklet(new Tasklet() {    //익명클래스 선언  (기본적으로 무한반복)
//                    @Override
//                    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
//                        System.out.println("==========================");
//                        System.out.println(" >> Step2 was executed!!");
//                        System.out.println("==========================");
//
//                        return RepeatStatus.FINISHED;
//
//                         /*
//                         반복을 계속할 것인지를 설정
//                         null : 1번 == RepeatStatus.FINISHED
//                         */
//                    }
//                })
//                .build();
//    }
//
//    // Job구동 -> Step실행 -> Tasklet실행
}
