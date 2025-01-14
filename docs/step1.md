## [Step1] 볼링 점수판 (그리기)

### 기능 요구 사항
- 최종 목표는 볼링 점수를 계산하는 프로그램을 구현한다. 1단계 목표는 점수 계산을 제외한 볼링 게임 점수판을 구현하는 것이다.
- 각 프레임이 스트라이크이면 "X", 스페어이면 "9 | /", 미스이면 "8 | 1", 과 같이 출력하도록 구현한다.
    - 스트라이크(strike) : 프레임의 첫번째 투구에서 모든 핀(10개)을 쓰러트린 상태
    - 스페어(spare) : 프레임의 두번재 투구에서 모든 핀(10개)을 쓰러트린 상태
    - 미스(miss) : 프레임의 두번재 투구에서도 모든 핀이 쓰러지지 않은 상태
    - 거터(gutter) : 핀을 하나도 쓰러트리지 못한 상태. 거터는 "-"로 표시
- 10 프레임은 스트라이크이거나 스페어이면 한 번을 더 투구할 수 있다.

### 프로그래밍 요구 사항
- **객체지향 생활 체조 원칙** 을 지키면서 프로그래밍한다.
    - 규칙 1: 한 메서드에 오직 한 단계의 들여쓰기만 한다.
    - 규칙 2: else 예약어를 쓰지 않는다.
    - 규칙 3: 모든 원시값과 문자열을 포장한다.
    - 규칙 4: 한 줄에 점을 하나만 찍는다.
    - 규칙 5: 줄여쓰지 않는다(축약 금지).
    - 규칙 6: 모든 엔티티를 작게 유지한다.
    - 규칙 7: 3개 이상의 인스턴스 변수를 가진 클래스를 쓰지 않는다.
    - 규칙 8: 일급 콜렉션을 쓴다.
    - 규칙 9: 게터/세터/프로퍼티를 쓰지 않는다.

### 구현 시작 방법
- 볼링 게임의 점수 계산 방식 아는 사람은 바로 구현을 시작한다.
- 점수 계산 방식을 모르는 사람은 구글에서 "볼링 점수 계산법"과 같은 키워드로 검색해 볼링 게임의 점수 계산 방식을 학습한 후 구현을 시작한다.

### 출력 결과
```
플레이어 이름은(3 english letters)?: PJS
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |      |      |      |      |      |      |      |      |      |      |

1프레임 투구 : 10
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |      |      |      |      |      |      |      |      |      |

2프레임 투구 : 8
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |  8   |      |      |      |      |      |      |      |      |

2프레임 투구 : 2
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |  8|/ |      |      |      |      |      |      |      |      |

3프레임 투구 :  7
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |  8|/ |  7   |      |      |      |      |      |      |      |

3프레임 투구 :  : 0
| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |
|  PJS |  X   |  8|/ |  7|- |      |      |      |      |      |      |      |

...
```

#### 힌트
> - 객체 단위를 가장 작은 단위까지 극단적으로 분리하는 시도를 해본다.
> - 1 ~ 9 프레임을 NormalFrame, 10 프레임을 FinalFrame과 같은 구조로 구현한 후 Frame을 추가해 중복을 제거해 본다.
> - 다음 Frame을 현재 Frame 외부에서 생성하기 보다 현재 Frame에서 다음 Frame을 생성하는 방식으로 구현해 보고, 어느 구현이 더 좋은지 검토해 본다.
