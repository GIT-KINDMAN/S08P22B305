import Spinner from '../assets/Spin-1s-200px.gif';
import tw from 'tailwind-styled-components';

const Loading = () => {
  return (
    <LoadingDiv>
      <div style={{ textAlign: 'center' }}>
        <img src={Spinner} alt="로딩중" />
      </div>
    </LoadingDiv>
  );
};

export default Loading;

const LoadingDiv = tw.div`absolute h-screen w-88vw top-0 z-50 flex items-center justify-center flex-col `;
