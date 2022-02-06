import styles from "../../../styles/components/elements/Tasks.module.css";
import Link from 'next/link'

const Tasks = () => {
    return (
        <div className="row">
            <div className="card">
                <div className="card-body">
                    <div className="table-responsive project-list">
                        <table className="table project-table table-centered table-nowrap">
                            <thead>
                            <tr>
                                <th scope="col">번호</th>
                                <th scope="col">고객사</th>
                                <th scope="col">제목</th>
                                <th scope="col">우선순위</th>
                                <th scope="col">요청타입</th>
                                <th scope="col">오류타입</th>
                                <th scope="col">접수일자</th>
                                <th scope="col">완료예정일</th>
                                <th scope="col">상태</th>
                            </tr>
                            </thead>
                            <tbody>
                                <Link href="/register/register" >
                                    <tr>
                                        <th scope="row">1</th>
                                        <td>산하정보기술</td>
                                        <td>SR 접수건</td>
                                        <td>
                                            긴급
                                        </td>
                                        <td>
                                            신규
                                        </td>
                                        <td>
                                            서버 장애
                                        </td>
                                        <td>
                                            2022-02-04
                                        </td>
                                        <td>
                                            2022-05-01
                                        </td>
                                        <td>
                                            진행
                                        </td>
                                    </tr>
                                </Link>
                            </tbody>
                        </table>
                    </div>

                    <div className="pt-3">
                        <ul className="pagination justify-content-end mb-0">
                            <li className="page-item disabled">
                                <a className="page-link" href="#" tabIndex={-1} aria-disabled="true">Previous</a>
                            </li>
                            <li className="page-item"><a className="page-link" href="#">1</a></li>
                            <li className="page-item active"><a className="page-link" href="#">2</a></li>
                            <li className="page-item"><a className="page-link" href="#">3</a></li>
                            <li className="page-item">
                                <a className="page-link" href="#">Next</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Tasks;